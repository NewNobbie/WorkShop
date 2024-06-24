package com.riwi.Library.Management.infrastructure.Services;

import com.riwi.Library.Management.api.dtos.request.BookReq;
import com.riwi.Library.Management.api.dtos.response.BookResponse;
import com.riwi.Library.Management.infrastructure.abstractServices.IBookService;
import com.riwi.Library.Management.infrastructure.helpers.mappers.BookMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.Library.Management.domain.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
@AllArgsConstructor
public class BookService implements IBookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper bookMapper;

    @Override
    public BookResponse create(BookReq request) {
        Boo book = this.bookMapper.toEntity(request);
        return this.bookMapper.toResponse(this.bookRepository.save(book));
    }

    @Override
    public Page<BookResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public BookResponse update(BookReq request, Long aLong) {
        return null;
    }

    @Override
    public BookResponse get(Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
