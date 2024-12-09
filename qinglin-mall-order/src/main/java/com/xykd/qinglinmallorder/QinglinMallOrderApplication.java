package com.xykd.qinglinmallorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xykd.qinglinmallorder.dao")
@SpringBootApplication
public class QinglinMallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(QinglinMallOrderApplication.class, args);
    }

}
