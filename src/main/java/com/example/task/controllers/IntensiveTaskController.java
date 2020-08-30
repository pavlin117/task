package com.example.task.controllers;

import com.example.task.runner.IntensiveTaskRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IntensiveTaskController {
    @Autowired
    private IntensiveTaskRunner intensiveTaskRunner;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/intense")
    public String runIntensiveTask() {
     return intensiveTaskRunner.runTask();
    }
}