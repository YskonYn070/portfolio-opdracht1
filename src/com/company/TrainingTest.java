package com.company;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class TrainingTest {
        @Test
        public void LeeftijdsCheckWeigering() {
            Training training= new Training(16, 5);
            assertFalse(training.LeeftijdsCheck(12,3 ));
            assertTrue(training. LeeftijdsCheck (17,1 ));
            assertTrue(training. LeeftijdsCheck (9,8 )); } }

}
