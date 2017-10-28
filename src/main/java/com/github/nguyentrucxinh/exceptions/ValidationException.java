package com.github.nguyentrucxinh.exceptions;

public class ValidationException extends RuntimeException
{
    // ======================================
    // =            Constructors            =
    // ======================================

    public ValidationException()
    {
        super();
    }

    public ValidationException(String message)
    {
        super(message);
    }
}
