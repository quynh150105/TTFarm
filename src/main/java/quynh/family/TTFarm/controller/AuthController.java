package quynh.family.TTFarm.controller;

import com.nimbusds.jose.JOSEException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import quynh.family.TTFarm.base.RestApiV1;
import quynh.family.TTFarm.constant.UrlConstant;
import quynh.family.TTFarm.domain.dto.request.IntrospectRequest;
import quynh.family.TTFarm.domain.dto.request.LoginRequest;
import quynh.family.TTFarm.domain.dto.request.LogoutRequest;
import quynh.family.TTFarm.domain.dto.request.RefreshTokenRequest;
import quynh.family.TTFarm.domain.dto.response.ApiResponse;
import quynh.family.TTFarm.domain.dto.response.IntrospectResponse;
import quynh.family.TTFarm.domain.dto.response.LoginResponse;
import quynh.family.TTFarm.service.AuthService;

import java.text.ParseException;

@RestApiV1
@RequiredArgsConstructor
@Slf4j
public class AuthController {
    private final AuthService authService;

    @PostMapping(UrlConstant.Auth.LOGIN)
    public ResponseEntity<ApiResponse<?>> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok().body(
                ApiResponse.<LoginResponse>builder()
                        .data(authService.login(request))
                        .message("Login successful")
                        .status(HttpStatus.OK.value())
                        .build()

        );
    }

    @PostMapping(UrlConstant.Auth.LOGOUT)
    public ResponseEntity<ApiResponse<?>> logut(@RequestBody LogoutRequest request){
        authService.logout(request);
        return ResponseEntity.ok().body(
                ApiResponse.builder()
                        .message("logout successful")
                        .status(HttpStatus.OK.value())
                        .build()

        );
    }
    @PostMapping(UrlConstant.Auth.REFRESH_TOKEN)
    public ResponseEntity<ApiResponse<?>> authenticate(@RequestBody RefreshTokenRequest request)
            throws ParseException, JOSEException {
        return ResponseEntity.ok().body(
                ApiResponse.<LoginResponse>builder()
                        .data(authService.refreshToken(request))
                        .message("refresh successful")
                        .status(HttpStatus.OK.value())
                        .build()

        );
    }

    @PostMapping(UrlConstant.Auth.INTROSPECT)
    public ResponseEntity<ApiResponse<IntrospectResponse>>  authenticate(@RequestBody IntrospectRequest request)
            throws ParseException, JOSEException {
        return ResponseEntity.ok().body(
                ApiResponse.<IntrospectResponse>builder()
                        .data(authService.introspect(request))
                        .message("introspect successful")
                        .status(HttpStatus.OK.value())
                        .build()

        );
    }
}
