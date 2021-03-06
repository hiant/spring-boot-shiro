package com.example.springboot.shiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.example.springboot.shiro")
@MapperScan("com.example.springboot.shiro.mapper")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class SpringBootShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootShiroApplication.class, args);
    }
}
