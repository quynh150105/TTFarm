package quynh.family.TTFarm.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import quynh.family.TTFarm.constant.ErrorMessage;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LogoutRequest {
    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    private String token;
}
