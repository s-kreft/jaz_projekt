package com.example.jaz_projekt.Services;

import com.example.jaz_projekt.Models.Root;
import com.example.jaz_projekt.Repository.NbpRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class NbpService {
    private final RestTemplate rest;
    private final NbpRepository repository;

    public NbpService(RestTemplate rest, NbpRepository repository) {
        this.rest = rest;
        this.repository = repository;
    }

    public ResponseEntity<Root> getCurrencies(Date startDate, Date endDate) {
        var results = rest.getForEntity("http://api.nbp.pl/api/exchangerates/tables/A/"+ startDate + "/" + endDate + "/?format=json", Root.class);
        return results;
    }
}


//http://api.nbp.pl/api/exchangerates/tables/A/2022-06-25/2022-07-01/