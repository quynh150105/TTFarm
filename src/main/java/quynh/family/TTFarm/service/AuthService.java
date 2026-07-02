package quynh.family.TTFarm.service;

import com.nimbusds.jose.JOSEException;
import quynh.family.TTFarm.domain.dto.request.IntrospectRequest;
import quynh.family.TTFarm.domain.dto.request.LoginRequest;
import quynh.family.TTFarm.domain.dto.request.LogoutRequest;
import quynh.family.TTFarm.domain.dto.request.RefreshTokenRequest;
import quynh.family.TTFarm.domain.dto.response.IntrospectResponse;
import quynh.family.TTFarm.domain.dto.response.LoginResponse;

import java.text.ParseException;

public interface AuthService {
    IntrospectResponse introspect(IntrospectRequest request);
    LoginResponse login(LoginRequest request);
    void logout(LogoutRequest request);
    LoginResponse refreshToken(RefreshTokenRequest request) throws ParseException, JOSEException;

}
