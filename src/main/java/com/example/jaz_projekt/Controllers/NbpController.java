package com.example.jaz_projekt.Controllers;

import com.example.jaz_projekt.Services.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbpController {
    private NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    public ResponseEntity<> getData() {
        return;
    }
}
