package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class TariefTest {
    @Test
    void getPrijs() {
        assertEquals (0.0, Tarief.BepaalPrijs (4, true, true, false), 0.001);
        assertEquals (0.0, Tarief.BepaalPrijs (4, false, false, true), 0.001);
        assertEquals (50.0, Tarief.BepaalPrijs (8, true, false, true), 0.001);
        assertEquals (0.0, Tarief.BepaalPrijs (8, false, true, false), 0.001);
        assertEquals (0.0, Tarief.BepaalPrijs (13, true, false, false), 0.001);
        assertEquals (70.0, Tarief.BepaalPrijs (13, false, true, true), 0.001);
    }
}
