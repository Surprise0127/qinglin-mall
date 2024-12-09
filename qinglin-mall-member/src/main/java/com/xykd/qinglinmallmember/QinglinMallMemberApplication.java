package com.xykd.qinglinmallmember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xykd.qinglinmallmember.dao")
@SpringBootApplication
public class QinglinMallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(QinglinMallMemberApplication.class, args);
    }

}
