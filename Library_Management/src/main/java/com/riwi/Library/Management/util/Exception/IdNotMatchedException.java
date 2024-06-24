package com.riwi.Library.Management.util.Exception;

public class IdNotMatchedException extends RuntimeException{

    private static final String ERROR_MESSAGE = "Request Id must be match with oath Id for %s ";

    // RuntimeException constructor to handle exceptions and insert the message
    public IdNotMatchedException(String nameEntity){
        super(String.format(ERROR_MESSAGE, nameEntity));
    }
}
