package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;

public class TestAvionFactory {

    public static void main(String[] args) {

        Avion avion1 = AvionFactory.getInstance("ABCD","TurkishAirline","jet");
        //Passager p1 = new Passager("Dupont","Jean",3);
        //avion1.ajoutPassagers(p1);

        Avion avion2 = AvionFactory.getInstance("EFGH","Pegasus","jet");
        Passager p2 = new Passager("Dupont","Jean",3);
        avion2.ajoutPassagers(p2);

        System.out.println("Avion1 -> Immatriculation: "+avion1.getImmatriculation()+", Marque: "+avion1.getMarque()+", Modele: "+avion1.getModele());
        System.out.println("Avion2 -> Immatriculation: "+avion2.getImmatriculation()+", Marque: "+avion2.getMarque()+", Modele: "+avion2.getModele());

        Avion avion3= AvionFactory.transfert(avion1,avion2);

        System.out.println("Avion3 -> Immatriculation: "+avion3.getImmatriculation()+", Marque: "+avion3.getMarque()+", Modele: "+avion3.getModele());


    }
}
