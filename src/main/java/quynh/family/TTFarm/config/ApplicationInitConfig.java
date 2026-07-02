package quynh.family.TTFarm.config;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import quynh.family.TTFarm.domain.entity.Role;
import quynh.family.TTFarm.domain.entity.User;
import quynh.family.TTFarm.repositoty.UserRepository;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class ApplicationInitConfig {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Bean
    ApplicationRunner applicationRunner(UserRepository userRepository){
        log.info("Initializing application.....");
        return args -> {
            if(userRepository.findByUsername("admin").isEmpty()){
                User user = User.builder()
                        .email("administrator@gmail.com")
                        .username("admin")
                        .password(passwordEncoder.encode("admin"))
                        .firstName("System")
                        .lastName("Admin")
                        .role(Role.ADMIN)
                        .build();
                userRepository.save(user);
                log.warn("admin user has been created with default password: admin, please change it");
            }
            log.info("Application initialization completed .....");
        };
    }

}
