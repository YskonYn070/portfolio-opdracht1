package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeerlingTest {
    @Test
    void PrijsBepalen() {
        int leeftijd0 = 0;
        int leeftijd1 = 0;
        int leeftijd4 = 0;
        int leeftijd5 = 60 ;
        int leeftijd6 = 60;
        int leeftijd8 = 60;
        int leeftijd10 = 80;
        int leeftijd11 = 80;


        assertEquals (0.0, new Leerling (leeftijd0).PrijsBepalen (), 0.001);
        assertEquals (0.0, new Leerling (leeftijd1).PrijsBepalen (), 0.001);
        assertEquals (0.0, new Leerling (leeftijd4).PrijsBepalen (), 0.001);
        assertEquals (60.0, new Leerling (leeftijd5).PrijsBepalen (), 0.001);
        assertEquals (60.0, new Leerling (leeftijd6).PrijsBepalen (), 0.001);
        assertEquals (60.0, new Leerling (leeftijd8).PrijsBepalen (), 0.001);
        assertEquals (80.0, new Leerling (leeftijd10).PrijsBepalen (), 0.001);
        assertEquals (80.0, new Leerling (leeftijd11).PrijsBepalen (), 0.001);
    }
}


}
