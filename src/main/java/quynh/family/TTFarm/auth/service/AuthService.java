package quynh.family.TTFarm.auth.service;

import com.nimbusds.jose.JOSEException;
import quynh.family.TTFarm.auth.domain.dto.request.IntrospectRequest;
import quynh.family.TTFarm.auth.domain.dto.request.LoginRequest;
import quynh.family.TTFarm.auth.domain.dto.request.LogoutRequest;
import quynh.family.TTFarm.auth.domain.dto.request.RefreshTokenRequest;
import quynh.family.TTFarm.auth.domain.dto.response.IntrospectResponse;
import quynh.family.TTFarm.auth.domain.dto.response.LoginResponse;

import java.text.ParseException;

public interface AuthService {
    IntrospectResponse introspect(IntrospectRequest request);
    LoginResponse login(LoginRequest request);
    void logout(LogoutRequest request);
    LoginResponse refreshToken(RefreshTokenRequest request) throws ParseException, JOSEException;

}
