package com.github.nguyentrucxinh.service.impl;

import com.github.nguyentrucxinh.domain.HelloWorld;
import com.github.nguyentrucxinh.repository.HelloWorldRepository;
import com.github.nguyentrucxinh.service.HelloWorldService;

import javax.inject.Inject;
import java.util.List;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Inject
    private HelloWorldRepository helloWorldRepository;

    @Override
    public List<HelloWorld> findAll() {
        return helloWorldRepository.findAll();
    }

    @Override
    public HelloWorld findById(Long id) {
        return helloWorldRepository.findById(id);
    }

    @Override
    public Long create(HelloWorld helloWorld) {
        return helloWorldRepository.create(helloWorld);
    }

    @Override
    public void update(Long id, HelloWorld helloWorld) {
        helloWorldRepository.update(id, helloWorld);
    }

    @Override
    public void delete(Long id) {
        helloWorldRepository.delete(id);
    }
}
