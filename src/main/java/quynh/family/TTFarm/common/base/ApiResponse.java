package quynh.family.TTFarm.common.base;

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
