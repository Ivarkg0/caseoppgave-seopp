package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    private final BrevService brevService = new BrevService();
    private final AvtaleProvider avtaleProvider = new AvtaleProvider();
    private final AvtaleService avtaleService = new AvtaleService(avtaleProvider, brevService);

    @Test
    void avtaleServiceReturnsString() {
        final String result  = avtaleService.opprettAvtale();
        assertEquals("Avtalenummer: 1234", result);
    }

}
