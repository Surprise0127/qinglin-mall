package com.xykd.qinglinmallware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xykd.qinglinmallware.dao")
@SpringBootApplication
public class QinglinMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(QinglinMallWareApplication.class, args);
    }

}
