package quynh.family.TTFarm.user.domain.dto.response;

import lombok.*;
import quynh.family.TTFarm.common.unums.Role;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserResponse {

    String id;

    String email;

    String username;

    String password;

    String firstName;

    String lassName;

    Role role;

}
