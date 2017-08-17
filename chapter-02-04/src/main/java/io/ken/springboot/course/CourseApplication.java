package io.ken.springboot.course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CourseApplication.class, args);
    }
}
