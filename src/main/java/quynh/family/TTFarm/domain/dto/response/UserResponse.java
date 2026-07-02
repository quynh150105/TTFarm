package quynh.family.TTFarm.domain.dto.response;

import lombok.*;
import quynh.family.TTFarm.domain.entity.Role;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {
    String id;

    String email;

    String username;

    String password;

    String firstName;

    String lastName;

    Role role;
}
