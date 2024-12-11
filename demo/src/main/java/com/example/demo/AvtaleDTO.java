package com.example.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Value
@Builder
public class AvtaleDTO {
    String avtaleNummer;
    String kundeID;
    String status;
}
