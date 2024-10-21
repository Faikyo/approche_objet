package fr.diginamic.combat.modele;

public class PotionAttaque extends Potion {

    public PotionAttaque() {
        type="ATTAQUE";
        duree=1;
        puissance=3;

    }

    @Override
    public String toString() {
        return "PotionAttaque{" +
                "attaqueMineur=" + puissance +
                ", type='" + type + '\'' +
                ", duree=" + duree +
                '}';
    }
}
