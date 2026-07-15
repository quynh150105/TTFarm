package quynh.family.TTFarm.user.service;



import quynh.family.TTFarm.user.domain.dto.request.CreateUserRequest;
import quynh.family.TTFarm.user.domain.dto.response.CreateUserResponse;
import quynh.family.TTFarm.user.domain.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest request);
    List<UserResponse> getAllUser();

}
