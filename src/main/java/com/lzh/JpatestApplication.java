package com.lzh;

import com.lzh.basedao.support.MyRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = MyRepositoryImpl.class)
public class JpatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpatestApplication.class, args);
    }

}
