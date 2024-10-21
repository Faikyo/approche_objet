package fr.diginamic.combat.modele;


import static fr.diginamic.combat.NbAléatoire.getRandomNumber;

public class Loup extends Creature {

    public Loup() {
        force=getRandomNumber(3,8);
        sante=getRandomNumber(5,10);
        score=1;
    }

    @Override
    public String toString() {
        return "Loup{" +
                "force=" + force +
                ", sante=" + sante +
                '}';
    }
}
