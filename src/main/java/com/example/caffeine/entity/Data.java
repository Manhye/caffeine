package com.example.caffeine.entity;

import jakarta.persistence.*;

public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private Double weight;

    public Data(){}
    public Data(String type, Double weight){
        this.type = type;
        this.weight = weight;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setType(String type){
        this.type = type;
    }

    public Double getWeight(){
        return weight;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }
}
