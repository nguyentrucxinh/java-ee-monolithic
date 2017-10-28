package com.github.nguyentrucxinh.repository;

import com.github.nguyentrucxinh.domain.HelloWorld;

import java.util.List;

public interface HelloWorldRepository {

    List<HelloWorld> findAll();

    HelloWorld findById(Long id);

    Long create(HelloWorld helloWorld);

    void update(Long id, HelloWorld helloWorld);

    void delete(Long id);
}
