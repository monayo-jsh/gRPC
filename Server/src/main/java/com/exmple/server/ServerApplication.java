package com.exmple.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration({
    // SpringBoot 3버전 gRPC Server 관련 Config 설정
    net.devh.boot.grpc.common.autoconfigure.GrpcCommonCodecAutoConfiguration.class,
    net.devh.boot.grpc.common.autoconfigure.GrpcCommonTraceAutoConfiguration.class,

    net.devh.boot.grpc.server.autoconfigure.GrpcAdviceAutoConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcHealthServiceAutoConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcMetadataConsulConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcMetadataEurekaConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcMetadataNacosConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcMetadataZookeeperConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcReflectionServiceAutoConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcServerAutoConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcServerFactoryAutoConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcServerMetricAutoConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcServerSecurityAutoConfiguration.class,
    net.devh.boot.grpc.server.autoconfigure.GrpcServerTraceAutoConfiguration.class
})
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
