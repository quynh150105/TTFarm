package quynh.family.TTFarm.user.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import quynh.family.TTFarm.common.unums.Role;

@Entity()
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column(name="email", nullable = false)
    String email;

    @Column(name="username", nullable = false)
    String username;

    @Column(name="password", nullable = false)
    String password;

    @Column(name="phone")
    String phone;

    String avatarUrl;

    String firstName;

    String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    @Builder.Default
    Role role = Role.USER;

}
