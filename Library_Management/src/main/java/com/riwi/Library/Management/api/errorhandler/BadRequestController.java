package com.riwi.Library.Management.api.errorhandler;

import com.riwi.Library.Management.api.dtos.error.BaseErrorResponse;
import com.riwi.Library.Management.api.dtos.error.ErrorResponse;
import com.riwi.Library.Management.api.dtos.error.ErrorsResponse;
import com.riwi.Library.Management.util.Exception.IdNotFoundException;
import com.riwi.Library.Management.util.Exception.IdNotMatchedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// Error status
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseErrorResponse handlerBadRequest(MethodArgumentNotValidException exception){
        List<String> errors = new ArrayList<>();

        exception.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
        BaseErrorResponse baseErrorResponse = ErrorsResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .errors(errors)
                .build();
        return baseErrorResponse;
    }

    @ExceptionHandler(IdNotFoundException.class)
    public BaseErrorResponse handleIdNotFound(IdNotFoundException exception){
        return ErrorResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .message(exception.getMessage())
                .build();
    }

    @ExceptionHandler(IdNotFoundException.class)
    public BaseErrorResponse handleIdNotMatched(IdNotMatchedException exception){
        return ErrorResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .message(exception.getMessage())
                .build();
    }
}
