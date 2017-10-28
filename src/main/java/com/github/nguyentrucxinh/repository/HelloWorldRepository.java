package com.github.nguyentrucxinh.repository;

import com.github.nguyentrucxinh.model.HelloWorld;

import java.util.List;

public interface HelloWorldRepository {

    List<HelloWorld> findAll();
}
