package com.springRESTApi.springRestApi.todoRestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello shaon";
    }

    @GetMapping("/hello_bean")
    public HelloBean hello_bean(){
        return new HelloBean("Hello Shaon from Bean");
    }

    @GetMapping("/path_variable/{name}")
    public HelloBean hello_bean_path_variable(@PathVariable String name){
        return new HelloBean(String.format("Hello %s", name));
    }
}
