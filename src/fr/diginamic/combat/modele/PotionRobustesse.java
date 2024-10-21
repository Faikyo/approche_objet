package fr.diginamic.combat.modele;

public class PotionRobustesse extends Potion {

    public PotionRobustesse(){
        type="ROBUSTESSE";
        duree = 2;
        puissance=5;

    }

    @Override
    public String toString() {
        return "PotionRobustesse{" +
                "attaqueMajeur=" + puissance +
                ", type='" + type + '\'' +
                ", duree=" + duree +
                '}';
    }
}
