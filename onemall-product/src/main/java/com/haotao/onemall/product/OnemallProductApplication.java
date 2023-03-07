package com.haotao.onemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.haotao.onemall.product.dao")
@SpringBootApplication
public class OnemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnemallProductApplication.class, args);
    }

}
