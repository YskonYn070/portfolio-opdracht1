package com.company;

      class Training  {


        public int maximaleLeeftijd;
        public  int maximaleAfstand;

        public Training(int maximaleLeeftijd, int maximaleAfstand)
        {
            this. maximaleLeeftijd = maximaleLeeftijd;
            this. maximaleAfstand = maximaleAfstand;
        }

        public  boolean LeeftijdsCheckWeigering(int leeftijd, int afstand) {

            return (leeftijd < maximaleLeeftijd) || (afstand < maximaleAfstand);
        }
    }



