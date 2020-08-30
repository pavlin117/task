package com.example.task;

import com.example.task.runner.IntensiveTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskApplication {
    @Bean
    public IntensiveTaskRunner getAppName() {

        return new IntensiveTaskRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

}
