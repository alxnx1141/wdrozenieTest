package com.example.wdrozenieTest.controller;

import com.example.wdrozenieTest.service.AppService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class AppController {

    private final AppService appService;

    @GetMapping
    public String getTest(){
        return appService.test();
    }

}
