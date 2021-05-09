package com.company;

public class Tarief {
    private  int siblingKorting = 1;
    private  int trainerKorting = 1;
    private  int tarief=0;

    public void BepaalPrijs(int leeftijd, boolean b, boolean b1, boolean kleding) {
    }

    public double BepaalPrijs (int leeftijd, int siblingKorting, int trainerkorting, Boolean kleding) {

        double prijs = tarief;

        if (leeftijd >= 4) {
            tarief =  0;
        }
        else if (leeftijd >=5 ) {
            tarief =  60;
        }
        else if (leeftijd >=10 ) {
            tarief = 80;
        }

        if (siblingKorting>=1) {
            tarief = tarief - 10;
        }
        if (trainerKorting >= 1) {
            tarief = tarief * 0;
        }



        return prijs;
    }
}
