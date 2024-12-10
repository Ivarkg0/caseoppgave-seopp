package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AvtaleProvider {

    public AvtaleProvider() {
    }

    public KundeDTO opprettKunde() {
        // Opprett kunde mot fagsystem
        return mapKunde();
    }

    public AvtaleDTO opprettAvtale() {
        // Opprett avtale mot fagsystem
        return mapAvtale();
    }

    public void oppdaterStatus() {
        // Oppdater status mot fagsystem
    }

    public AvtaleDTO mapAvtale() {
        return AvtaleDTO.builder().avtaleNummer("1234").status("Tilbud Sendt").build();
    }
    public KundeDTO mapKunde() {
        return KundeDTO.builder().kundeID("1234").navn("Ola Nordmann").build();
    }
}
