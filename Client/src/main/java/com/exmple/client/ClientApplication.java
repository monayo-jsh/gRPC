package com.exmple.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration({
    // SpringBoot 3버전 gRPC Client 관련 Config 설정
    net.devh.boot.grpc.common.autoconfigure.GrpcCommonCodecAutoConfiguration.class,
    net.devh.boot.grpc.common.autoconfigure.GrpcCommonTraceAutoConfiguration.class,

    net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration.class,
    net.devh.boot.grpc.client.autoconfigure.GrpcClientMetricAutoConfiguration.class,
    net.devh.boot.grpc.client.autoconfigure.GrpcClientHealthAutoConfiguration.class,
    net.devh.boot.grpc.client.autoconfigure.GrpcClientSecurityAutoConfiguration.class,
    net.devh.boot.grpc.client.autoconfigure.GrpcClientTraceAutoConfiguration.class,
    net.devh.boot.grpc.client.autoconfigure.GrpcDiscoveryClientAutoConfiguration.class,

})
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
