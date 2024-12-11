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

    public KlientReponse opprettAvtale(KlientRequest request) {

        // Opprett kunde fagsystem

        final KundeDTO kunde = avtaleProvider.opprettKunde(request);

        // Opprett avtale fagsystem

        final AvtaleDTO avtale = avtaleProvider.opprettAvtale(kunde);

        // Send avtale til kunde

        brevService.sendAvtale(kunde, avtale);

        // Oppdater status i avtale fagsystem

        final AvtaleDTO responseStatus = avtaleProvider.oppdaterStatus();

        // Send Avtalenummer og status til klient
        return KlientReponse.builder().avtaleNummer(avtale.getAvtaleNummer()).staus(responseStatus.getStatus()).build();
    }
}
