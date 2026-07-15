package quynh.family.TTFarm.user.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import quynh.family.TTFarm.common.base.RestApiV1;
import quynh.family.TTFarm.common.constant.UrlConstant;
import quynh.family.TTFarm.user.domain.dto.request.CreateUserRequest;
import quynh.family.TTFarm.common.base.ApiResponse;
import quynh.family.TTFarm.user.domain.dto.response.CreateUserResponse;
import quynh.family.TTFarm.user.domain.dto.response.UserResponse;
import quynh.family.TTFarm.user.service.UserService;

import java.util.List;



@RestApiV1
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(UrlConstant.User.REGISTER)
    public ResponseEntity<ApiResponse<CreateUserResponse>> register(@Valid  @RequestBody CreateUserRequest request){
        return ResponseEntity.ok().body(
                ApiResponse.<CreateUserResponse>builder()
                        .data(userService.createUser(request))
                        .message("Create user")
                        .status(HttpStatus.OK.value())
                        .build()

        );
    }

    @GetMapping(UrlConstant.User.ALL_USER)
    public ResponseEntity<ApiResponse<List<UserResponse>>> getAll(){
        return ResponseEntity.ok().body(
                ApiResponse.<List<UserResponse>>builder()
                        .data(userService.getAllUser())
                        .message("Get all user")
                        .status(HttpStatus.OK.value())
                        .build()

        );
    }
}
