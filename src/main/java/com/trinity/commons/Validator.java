package com.trinity.commons;

public interface Validator <T> {
    boolean validate(T entity);
    String getMessage();
}
