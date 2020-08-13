package com.example.webdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    public void t5(){

    }

    @RequestMapping("/test/{name}")
    public String test(@PathVariable String name){
        return "welcome "+name;
    }


    public void test(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
