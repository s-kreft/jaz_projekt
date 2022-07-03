package com.example.jaz_projekt.Controllers;

import com.example.jaz_projekt.Models.Currencies;
import com.example.jaz_projekt.Services.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

@RestController
public class NbpController {
    private NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    public ResponseEntity<Currencies> getData(@RequestParam Date startDate, @RequestParam Date endDate) {
        List<String> currenciestList = nbpService.getCurrencies(startDate, endDate);
        return ResponseEntity.ok(new List<String>(startDate, endDate));
    }
}
