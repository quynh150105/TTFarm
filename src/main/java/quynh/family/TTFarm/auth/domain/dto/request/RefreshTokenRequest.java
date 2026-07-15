package quynh.family.TTFarm.auth.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import quynh.family.TTFarm.common.constant.ErrorMessage;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RefreshTokenRequest {
    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    private String token;
}
