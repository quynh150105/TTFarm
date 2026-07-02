package quynh.family.TTFarm.domain.dto.response;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiResponse <T>{
    private int status;
    private String message;
    private T data;
}
