package quynh.family.TTFarm.user.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import quynh.family.TTFarm.common.unums.Role;
import quynh.family.TTFarm.user.domain.dto.request.CreateUserRequest;
import quynh.family.TTFarm.user.domain.dto.response.CreateUserResponse;
import quynh.family.TTFarm.user.domain.dto.response.UserResponse;
import quynh.family.TTFarm.user.domain.entity.User;
import quynh.family.TTFarm.user.domain.mapper.UserMapper;
import quynh.family.TTFarm.user.repository.UserRepository;
import quynh.family.TTFarm.user.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {

        if(userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("User already exists");
        }

        User user = User.builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .role(Role.USER)
                .build();
        userRepository.save(user);

        return userMapper.toCreateUseResponse(user);
    }

    @Override
    public List<UserResponse> getAllUser() {
        List<User> list = userRepository.findAll();
        return userMapper.toListUserResponse(list);
    }
}
