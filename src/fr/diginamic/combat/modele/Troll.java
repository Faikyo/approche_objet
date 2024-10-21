package fr.diginamic.combat.modele;

import static fr.diginamic.combat.NbAléatoire.getRandomNumber;

public class Troll extends Creature {

    public Troll() {
        force=getRandomNumber(10,15);
        sante=getRandomNumber(20,30);
        score= 5;
    }

    @Override
    public String toString() {
        return "Troll{" +
                "force=" + force +
                ", sante=" + sante +
                '}';
    }
}
