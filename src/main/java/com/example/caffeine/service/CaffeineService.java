package com.example.caffeine.service;

import com.example.caffeine.entity.Data;
import com.example.caffeine.repository.CaffeineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaffeineService {

    @Autowired
    private CaffeineRepository repository;

    public Data saveData(Data data) {
        return repository.save(data);
    }

    public List<Data> getAllData() {
        return repository.findAll();
    }
}
