package quynh.family.TTFarm.user.domain.dto.response;

import lombok.*;
import quynh.family.TTFarm.common.unums.Role;

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
