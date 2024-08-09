package com.exmple.client;

import com.example.grpc.HelloRequest;
import com.example.grpc.HelloResponse;
import com.example.grpc.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @GrpcClient("helloService")
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceClient;

    public String sayHello(String name) {
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloResponse response = helloServiceClient.sayHello(request);
        return response.getGreeting();
    }

}
