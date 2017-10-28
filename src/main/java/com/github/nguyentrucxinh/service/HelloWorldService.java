package com.github.nguyentrucxinh.service;

import com.github.nguyentrucxinh.domain.HelloWorld;

import java.util.List;

public interface HelloWorldService {

    List<HelloWorld> findAll();

    HelloWorld findById(Long id);

    Long create(HelloWorld helloWorld);

    void update(Long id, HelloWorld helloWorld);

    void delete(Long id);
}
