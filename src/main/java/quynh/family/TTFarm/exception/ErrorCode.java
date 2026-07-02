package quynh.family.TTFarm.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not found"),

    INVALID_USERNAME_OR_PASSWORD(HttpStatus.UNAUTHORIZED,
            "Username or password is incorrect"),

    UNAUTHENTICATED(HttpStatus.UNAUTHORIZED,
            "Unauthenticated"),

    INVALID_TOKEN(HttpStatus.UNAUTHORIZED,
            "Token is invalid"),

    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED,
            "Token has expired"),

    TOKEN_ALREADY_INVALIDATED(HttpStatus.UNAUTHORIZED,
            "Token has been logged out"),

    ACCESS_DENIED(HttpStatus.FORBIDDEN,
            "Access denied"),

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,
            "Internal server error");

    private final HttpStatus status;
    private final String message;
}