package com.riwi.Library.Management.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.riwi.Library.Management.api.dtos.request.LoanReq;
import com.riwi.Library.Management.api.dtos.response.LoanResponse;
import com.riwi.Library.Management.domain.entities.Loan;




@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {

    @Mappings({
            @Mapping(target ="user.id", source = "userId"),
            @Mapping(target = "book.id", source = "bookId")
    })
    Loan toEntity(LoanReq request);

    LoanResponse toResponse(Loan entity);

}
