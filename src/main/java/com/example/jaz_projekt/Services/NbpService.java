package com.example.jaz_projekt.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService {
    private final RestTemplate rest;

    public NbpService(RestTemplate rest) {
        this.rest = rest;
    }

    public void getCurrencies() {

    }

}


//http://api.nbp.pl/api/exchangerates/tables/A/2022-06-25/2022-07-01/