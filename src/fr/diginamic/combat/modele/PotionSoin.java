package fr.diginamic.combat.modele;

import static fr.diginamic.combat.NbAléatoire.getRandomNumber;

public class PotionSoin extends Potion {


    public PotionSoin() {
        type="SOIN";
        duree=0;
        puissance=getRandomNumber(5,10);
    }

    @Override
    public String toString() {
        return "PotionSoin{" +
                "soin=" + puissance +
                ", type='" + type + '\'' +
                ", duree=" + duree +
                '}';
    }
}
