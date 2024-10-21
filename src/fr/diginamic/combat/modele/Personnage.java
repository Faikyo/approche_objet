package fr.diginamic.combat.modele;

import java.util.ArrayList;

import static fr.diginamic.combat.NbAléatoire.getRandomNumber;

public class Personnage {

    public int force;

    public int sante;

    public int score;

    public ArrayList<Potion> inventaire = new ArrayList<Potion>();

    public Personnage() {
        force = getRandomNumber(12,18);
        sante = getRandomNumber(20,50);
        score=0;
    }



    public void ajoutPotion(Potion p) {
        inventaire.add(p);
    }
}
