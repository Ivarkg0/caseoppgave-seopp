package com.example.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class KundeDTO {
    private String kundeID;
    private String navn;
    private String adresse;
    private String epost;
}
