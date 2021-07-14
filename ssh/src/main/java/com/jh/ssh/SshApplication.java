package com.jh.ssh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@MapperScan("com.jh.ssh.mapper")
@CrossOrigin
public class SshApplication {

    public static void main(String[] args) {
        SpringApplication.run(SshApplication.class, args);
    }

}
