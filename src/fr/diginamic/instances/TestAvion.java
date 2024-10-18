package fr.diginamic.instances;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

import java.util.Date;

public class TestAvion {
    public static void main(String[] args) {
        Avion avion1 = new Avion("ABCD","TurkishAirline","jet");
        Avion Avion2 = new Avion("EFGH","Pegasus","jet");

        Passager p1 = new Passager("Dupont","Jean",3);

        avion1.ajoutPassagers(p1);

        avion1.getTabPassagers();

    }
}
