package com.riwi.Library.Management.infrastructure.helpers.mappers;

import com.riwi.Library.Management.api.dtos.request.ReservationReq;
import com.riwi.Library.Management.api.dtos.response.ReservationResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.Library.Management.domain.entities.Reservation;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {


    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "book", source = "bookId")
    Reservation toEntity(ReservationReq request);

    @InheritInverseConfiguration
    ReservationResponse toResponse(Reservation entity);
}
