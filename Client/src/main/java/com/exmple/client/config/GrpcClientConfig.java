package com.exmple.client.config;

import com.example.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;

// 커넥션 빈 직접 설정
//@Configuration
public class GrpcClientConfig {

    @Bean
    public ManagedChannelBuilder<?> managedChannelBuilder() {
        return ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext();
    }

    @Bean("helloServiceClient")
    public HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub(ManagedChannelBuilder<?> managedChannelBuilder) {
        ManagedChannel channel = managedChannelBuilder.build();
        return HelloServiceGrpc.newBlockingStub(channel);
    }

}
