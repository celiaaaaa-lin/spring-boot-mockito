package com.springboot.mockito.springbootmockito;

import org.springframework.stereotype.Component;

public class BusinessImpl {
    private DataService dataService;

    public BusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int value : data){
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}
