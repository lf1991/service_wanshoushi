package com.lanzhou.wanshou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.lanzhou.wanshou.dao")
public class LanzhouWanshouApplication {
    public static void main(String[] args) {
        SpringApplication.run(LanzhouWanshouApplication.class, args);
    }
}
