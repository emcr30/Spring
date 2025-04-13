package com.example.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

@RestController
@RequestMapping("/lab06")
public class Lab06Controller {

    @GetMapping
    public String hola() {
        return "Somos el grupo B";
    }

    @GetMapping("/phpinfo")
    public String info() {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        return "Java Version: " + System.getProperty("java.version") + "<br>" +
               "VM Name: " + bean.getVmName() + "<br>" +
               "Uptime: " + bean.getUptime() + " ms";
    }
}
