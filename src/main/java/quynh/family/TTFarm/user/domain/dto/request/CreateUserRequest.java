package quynh.family.TTFarm.user.domain.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import quynh.family.TTFarm.common.constant.ErrorMessage;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserRequest {

    @Email(message = ErrorMessage.INVALID_FORMAT_SOME_THING_FIELD)
    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    @NotNull(message = ErrorMessage.NOT_BLANK_FIELD)
    String email;

    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    @NotNull(message = ErrorMessage.NOT_BLANK_FIELD)
    String username;

    @NotBlank(message =  ErrorMessage.NOT_BLANK_FIELD)
    @NotNull(message = ErrorMessage.NOT_BLANK_FIELD)
    String password;

    @NotBlank(message =  ErrorMessage.NOT_BLANK_FIELD)
    String firstName;

    @NotBlank(message =  ErrorMessage.NOT_BLANK_FIELD)
    String lastName;
}
