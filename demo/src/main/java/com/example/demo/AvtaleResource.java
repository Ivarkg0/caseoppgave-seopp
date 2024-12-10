package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvtaleResource {

    private final AvtaleService avtaleService;

    AvtaleResource(AvtaleService avtaleService) {
        this.avtaleService = avtaleService;
    }

    //@PostMapping("/api/avtale")
    @GetMapping("/api/avtale")
    public String opprettAvtale() {
        return avtaleService.opprettAvtale();
    }
}


