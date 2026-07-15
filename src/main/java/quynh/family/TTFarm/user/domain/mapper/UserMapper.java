package quynh.family.TTFarm.user.domain.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import quynh.family.TTFarm.user.domain.dto.response.CreateUserResponse;
import quynh.family.TTFarm.user.domain.dto.response.UserResponse;
import quynh.family.TTFarm.user.domain.entity.User;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {

    UserResponse toUserResponse(User user);
    List<UserResponse> toListUserResponse(List<User> users);
    CreateUserResponse toCreateUseResponse(User user);
}
