package fr.diginamic.combat.modele;

import static fr.diginamic.combat.NbAléatoire.getRandomNumber;

public class Gobelin extends Creature {

    public Gobelin() {
        force=getRandomNumber(5,10);
        sante=getRandomNumber(10,15);
        score=2;
    }

    @Override
    public String toString() {
        return "Gobelin{" +
                "force=" + force +
                ", sante=" + sante +
                '}';
    }
}
