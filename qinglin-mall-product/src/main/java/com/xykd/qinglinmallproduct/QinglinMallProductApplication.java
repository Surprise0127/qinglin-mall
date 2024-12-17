package com.xykd.qinglinmallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.xykd.qinglinmallproduct.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class QinglinMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(QinglinMallProductApplication.class, args);
    }

}
