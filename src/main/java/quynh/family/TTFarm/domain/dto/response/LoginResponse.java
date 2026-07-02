package quynh.family.TTFarm.domain.dto.response;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {
    private String token;
    boolean authenticated;
}
