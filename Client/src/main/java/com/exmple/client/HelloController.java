package com.exmple.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloServiceClient;

    public HelloController(HelloService helloServiceClient) {
        this.helloServiceClient = helloServiceClient;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return helloServiceClient.sayHello(name);
    }

}
