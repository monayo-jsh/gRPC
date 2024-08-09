package com.exmple.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 직접 구동 시 잘 뜸
        Server server = ServerBuilder.forPort(9090)
                                     .addService(new HelloServiceImpl())
                                     .build();

        server.start();
        System.out.println("server started, listening on " + 9090);
        server.awaitTermination();
    }
}
