package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController
public class AvtaleResource {

    private final AvtaleService avtaleService;

    AvtaleResource(AvtaleService avtaleService) {
        this.avtaleService = avtaleService;
    }

    @PostMapping("/api/avtale")
    public @ResponseBody KlientReponse opprettAvtale(@RequestBody KlientRequest request) {
        return avtaleService.opprettAvtale(request);
    }
}


