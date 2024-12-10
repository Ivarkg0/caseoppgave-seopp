package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AvtaleService {

    private final AvtaleProvider avtaleProvider;
    private final BrevService brevService;

    public AvtaleService(AvtaleProvider avtaleProvider, BrevService brevService) {
        this.avtaleProvider = avtaleProvider;
        this.brevService = brevService;
    }

    public String opprettAvtale() {

        // Opprett kunde fagsystem

        avtaleProvider.opprettKunde();

        // Opprett avtale fagsystem

        avtaleProvider.opprettAvtale();

        // Send avtale til kunde

        brevService.sendAvtale();

        // Oppdater status i avtale fagsystem

        avtaleProvider.oppdaterStatus();

        // Send Avtalenummer og status til klient
        return "Avtalenummer: 1234 \nStatus: Tilbud Sendt";
    }
}
