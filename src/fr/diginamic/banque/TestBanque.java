package fr.diginamic.banque;

import java.util.ArrayList;

public class TestBanque {
    public static void main(String[] args) {

        ArrayList<Compte> tabCompte = new ArrayList<>();

        tabCompte.add(new Compte(1,15));
        tabCompte.add(new CompteTaux(2,10,6));

        for (Compte c : tabCompte){
            System.out.println(c.toString());
        }
    }
}
