package com.riwi.Library.Management.infrastructure.helpers.mappers;

import com.riwi.Library.Management.api.dtos.request.BookReq;
import com.riwi.Library.Management.api.dtos.response.BookBasicResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.awt.print.Book;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {

    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    Book toEntity(BookReq request);

    BookBasicResponse toResponseBasic(Book entity);

    BookReq toResponse(Book entity);
}
