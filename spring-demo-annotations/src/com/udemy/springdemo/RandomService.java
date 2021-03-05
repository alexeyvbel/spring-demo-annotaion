package com.udemy.springdemo;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService{

    private String[] data ={
            "sdg",
            "adagf",
            "sddg"
    };


    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
