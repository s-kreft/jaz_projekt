package com.example.jaz_projekt.Controllers;

import com.example.jaz_projekt.Models.Currencies;
import com.example.jaz_projekt.Services.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("")
public class NbpController {
    private NbpService nbpService;

    @GetMapping("")
    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    public ResponseEntity<Currencies> getData(@RequestParam Date startDate, @RequestParam Date endDate) {
        void currencies = nbpService.getCurrencies(startDate, endDate);
        return ResponseEntity.ok(new Currencies(startDate, endDate));
    }
}
