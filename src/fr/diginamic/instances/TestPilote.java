package fr.diginamic.instances;

import fr.diginamic.instances.entites.Pilote;

import java.util.Date;

public class TestPilote {
    public static void main(String[] args) {
        Pilote pilote1 = new Pilote("Dupont","Jean",new Date(5,12,2020));
        Pilote pilote2 = new Pilote("Rivelle", "Theodore", new Date(8,5,2018));

    }
}
