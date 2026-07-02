package quynh.family.TTFarm.service;



import quynh.family.TTFarm.domain.dto.request.CreateUserRequest;
import quynh.family.TTFarm.domain.dto.response.CreateUserResponse;
import quynh.family.TTFarm.domain.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest request);
    List<UserResponse> getAllUser();

}
