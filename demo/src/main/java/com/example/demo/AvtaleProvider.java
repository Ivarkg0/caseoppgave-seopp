package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AvtaleProvider {

    public AvtaleProvider() {
    }

    public KundeDTO opprettKunde(KlientRequest request) {
        // Opprett kunde mot fagsystem
        //final FagsystemResponse fagsystemKundeResponse = fagsystem.createKunde(request);
        return mapKunde();
    }

    public AvtaleDTO opprettAvtale(KundeDTO kunde) {
        // Opprett avtale mot fagsystem
        //final FagsystemResponse fagsystemAvtaleResponse = fagsystem.createAvtale(kunde);
        return mapAvtale();
    }

    public AvtaleDTO oppdaterStatus() {
        // Oppdater status mot fagsystem
        return AvtaleDTO.builder().avtaleNummer("1234").status("Tilbud Sendt").build();
    }

    public AvtaleDTO mapAvtale() {
        //Map fagsystemResponse til AvtaleDTO
        return AvtaleDTO.builder().avtaleNummer("1234").status("Tilbud IKKE Sendt").build();
    }
    public KundeDTO mapKunde()
    {
        //Map fagsystemResponse til KundeDTO
        return KundeDTO.builder().kundeID("1234").navn("Ola Nordmann").build();
    }
}
