package com.ifan;

import com.alibaba.boot.hsf.annotation.HSFProvider;

@HSFProvider(serviceInterface = HelloWorldService.class)//指明提供服务的接口并实现
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHi(String name) {
        if(name == null || name.length() == 0)
            return null;
        else
            return "Hi " + name + " Welcome to HSF world";
    }
}
