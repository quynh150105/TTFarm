package quynh.family.TTFarm.auth.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import quynh.family.TTFarm.common.constant.ErrorMessage;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IntrospectRequest {
    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    String token;
}
