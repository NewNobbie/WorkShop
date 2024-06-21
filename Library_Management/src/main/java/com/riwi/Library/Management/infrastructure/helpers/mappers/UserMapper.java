package com.riwi.Library.Management.infrastructure.helpers.mappers;

import com.riwi.Library.Management.api.request.UserReq;
import com.riwi.Library.Management.api.response.UserResponse;
import com.riwi.Library.Management.domain.entities.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "loans",ignore = true)
    @Mapping(target = "resevations",ignore = true)
    User toUserEntity(UserReq userReq);

    @InheritInverseConfiguration
    UserResponse toUserResponse(User user);

    List<UserResponse> UserListToResponseList(List<User> users);
}
