package com.example.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Value
@Builder
public class KlientRequest {
    String KlientID;
    String navn;
    String adresse;
    String epost;
    String avtaledetaljer;
}
