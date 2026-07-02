package quynh.family.TTFarm.domain.dto.response;

import lombok.*;
import quynh.family.TTFarm.domain.entity.Role;

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
