package com.anthony.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ship")
    String status(){
        var item = "successful";
        return item;
    }
}
