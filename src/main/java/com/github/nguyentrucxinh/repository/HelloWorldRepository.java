package com.github.nguyentrucxinh.repository;

import com.github.nguyentrucxinh.domain.HelloWorld;

import java.util.List;

public interface HelloWorldRepository {

    List<HelloWorld> findAll();
}
