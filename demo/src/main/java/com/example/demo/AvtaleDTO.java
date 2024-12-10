package com.example.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AvtaleDTO {
    private String avtaleNummer;
    private String kundeID;
    private String status;
}
