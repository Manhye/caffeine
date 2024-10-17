package com.example.caffeine.controller;

import com.example.caffeine.entity.Data;
import com.example.caffeine.service.CaffeineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CaffeineController {

    @Autowired
    private CaffeineService service;

    @PostMapping("/carbon-data")
    public Data addData(@RequestBody Data data) {
        return service.saveData(data);
    }

    @GetMapping("/carbon-data")
    public List<Data> getAllData() {
        return service.getAllData();
    }
}
