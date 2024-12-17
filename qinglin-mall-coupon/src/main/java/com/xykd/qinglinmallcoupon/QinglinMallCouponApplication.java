package com.xykd.qinglinmallcoupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.xykd.qinglinmallcoupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class QinglinMallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(QinglinMallCouponApplication.class, args);
    }

}
