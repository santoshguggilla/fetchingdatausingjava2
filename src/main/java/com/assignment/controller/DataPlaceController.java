package com.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Data;

@RestController
public class DataPlaceController {

    @PostMapping("/postmethod")
    public String post() {
        return "post method";
    }

    @GetMapping("getmethod")
    public Data getMethod(@RequestBody Data data) {
        System.out.println(data.toString());
        return data;
    }

}
