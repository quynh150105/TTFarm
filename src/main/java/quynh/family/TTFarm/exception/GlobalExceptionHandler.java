package quynh.family.TTFarm.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import quynh.family.TTFarm.domain.dto.response.ApiResponse;

import java.util.Objects;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(AppException.class)
    public ResponseEntity<ApiResponse<?>> handleAppException(AppException e){
        ErrorCode errorCode = e.getErrorCode();
        return ResponseEntity.status(errorCode.getStatus())
                .body(ApiResponse.builder()
                        .status(errorCode.getStatus().value())
                        .message(errorCode.getMessage())
                        .build());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<?>> handleValidationException(MethodArgumentNotValidException ex) {
        String message = Objects.requireNonNull(ex.getBindingResult().getFieldError()).getDefaultMessage();
        return ResponseEntity.badRequest().body(ApiResponse.builder()
                .message(message)
                .build());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ApiResponse<?>> handleAccessDeniedException(AccessDeniedException ex) {
        return ResponseEntity.badRequest().body(ApiResponse.builder()
                .message("Bạn không có quyền truy cập tài nguyên này")
                .build());
    }

    @ExceptionHandler(NotFoundException.class)
    public  ResponseEntity<ApiResponse<?>> handleNotFoundException(NotFoundException ex){
        return ResponseEntity.badRequest().body(ApiResponse.builder()
                .message(ex.getMessage())
                .build());
    }

    @ExceptionHandler(RuntimeException.class)
    public  ResponseEntity<ApiResponse<?>> handleRuntimeException(RuntimeException ex){
        return ResponseEntity.badRequest().body(ApiResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build());
    }
}
