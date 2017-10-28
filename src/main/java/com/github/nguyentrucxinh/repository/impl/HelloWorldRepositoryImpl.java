package com.github.nguyentrucxinh.repository.impl;

import com.github.nguyentrucxinh.domain.HelloWorld;
import com.github.nguyentrucxinh.repository.HelloWorldRepository;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Singleton
public class HelloWorldRepositoryImpl implements HelloWorldRepository {

    private static final int INITIAL_ID = 1;
    private final AtomicLong counter = new AtomicLong(INITIAL_ID);
    private final Map<Long, HelloWorld> helloWorlds = new HashMap<>();

    @PostConstruct
    public void init() {
        long first = counter.getAndIncrement();
        helloWorlds.put(first, new HelloWorld(first, "Isaac"));
        long second = counter.getAndIncrement();
        helloWorlds.put(second, new HelloWorld(second, "Charles"));
    }

    @Override
    public List<HelloWorld> findAll() {
        List<HelloWorld> list = new ArrayList<>(helloWorlds.size());
        helloWorlds.forEach((key, value) -> list.add(value));
        return list;
    }
}
