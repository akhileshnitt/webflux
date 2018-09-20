package com.akhi.webflux.webflux.controller;

import com.akhi.webflux.webflux.util.Employee;
import com.akhi.webflux.webflux.util.EmployeeUtil;
import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class TestController {




    @GetMapping("/hello")
    public Publisher<String> welcome(){
        return Mono.just("Hello");
    }


    @GetMapping("/emp")
    public Flux<Employee> getAllEmp(){
        return Flux.fromIterable(EmployeeUtil.getEmployee());
    }

    @GetMapping("/emp1")
    public List<Employee> getAllEmp1(){
        return EmployeeUtil.getEmployee();
    }


}

