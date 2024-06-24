package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.dtos.request.BookReq;
import com.riwi.Library.Management.api.dtos.response.BookResponse;


public interface IBookService extends CRUDService <BookReq, BookResponse, Long>{
}
