package com.ifan;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HsfConsumerConfiguration {
    @HSFConsumer    //明确你要消费的API
    HelloWorldService helloWorldService;
}
