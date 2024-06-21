package com.riwi.Library.Management.util.Exception;

public class IdNotFoundException extends RuntimeException{

    private static final String ERROR_MESSAGE = "There aren't registers in entity %s with the supplied id";

    public IdNotFoundException(String nameEntity){super(String.format(ERROR_MESSAGE, nameEntity));}


}
