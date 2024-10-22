package fr.diginamic.combat.modele;

import java.util.ArrayList;
import java.util.HashMap;

import static fr.diginamic.combat.NbAléatoire.getRandomNumber;

public class Personnage {

    public int force;

    public int sante;

    public int score;

    public ArrayList<Potion> buff = new ArrayList<Potion>(); ;

    public ArrayList<Potion> inventaire = new ArrayList<Potion>();

    public Personnage() {
        force = getRandomNumber(12,18);
        sante = getRandomNumber(20,50);
        score=0;
    }



    public void ajoutPotion(Potion p) {
        inventaire.add(p);
    }

    public void utilisationPotion(Potion potion){

            if (inventaire.contains(potion)){
                System.out.println("Vous avez utiliser:"+potion.toString());
                buff.add(potion);
                inventaire.remove(potion);

            }

    }

    @Override
    public String toString() {
        return "Personnage{" +
                "force=" + force +
                ", sante=" + sante +
                ", score=" + score +
                ", buff=" + buff +
                ", inventaire=" + inventaire +
                '}';
    }
}
