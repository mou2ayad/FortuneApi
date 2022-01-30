package org.printing.fortuneApi.controller;

import org.printing.fortuneApi.contract.IEpigramProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpigramContoller {

    @Autowired
    private IEpigramProvider provider;


    @GetMapping("/getEpigram")
    public String getEpigram()
    {
        return provider.GetRandomEpigram();
    }

}
