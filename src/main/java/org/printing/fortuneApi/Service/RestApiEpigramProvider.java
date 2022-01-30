package org.printing.fortuneApi.Service;

import org.printing.fortuneApi.contract.IEpigramProvider;
import org.springframework.web.client.RestTemplate;


public class RestApiEpigramProvider implements IEpigramProvider {
    private final String providerUrl="https://api.justyy.workers.dev/api/fortune";

    @Override
    public String GetRandomEpigram(){
        var restTemplate=new RestTemplate();
        String text=restTemplate.getForObject(providerUrl, String.class);
        return text;
    }
    public static RestApiEpigramProvider getInatance(){
        return new RestApiEpigramProvider();
    } 
}
