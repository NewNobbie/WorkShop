package com.riwi.Library.Management.infrastructure.abstractServices;

import com.riwi.Library.Management.api.request.BookRequest;
import com.riwi.Library.Management.api.response.BookResponse;


public interface IBookService extends CRUDService <BookRequest, BookResponse, Long>{
}
