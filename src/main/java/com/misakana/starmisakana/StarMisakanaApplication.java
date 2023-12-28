package com.misakana.starmisakana;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.misakana.starmisakana.mapper")
public class StarMisakanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarMisakanaApplication.class, args);
    }

}
