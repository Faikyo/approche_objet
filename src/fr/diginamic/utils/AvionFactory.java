package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

import java.util.Date;

public class AvionFactory {

    public static Avion getInstance(String immatriculation, String marque, String modele){
        Avion avion =new Avion(immatriculation,marque,modele);
        return avion;
    }

    public static Avion transfert(Avion avion1, Avion avion2){
        int nbPassagers1=avion1.getNbPassagers();
        int nbPassagers2=avion2.getNbPassagers();
        if(nbPassagers1>nbPassagers2){
            for (Passager p : avion2.getTabPassagers()){
                avion1.ajoutPassagers(p);
            }
            return avion1;
        }
        else {
            for (Passager p : avion1.getTabPassagers()){
                avion2.ajoutPassagers(p);
            }
            return avion2;
        }
    }

    public static void main(String[] args) {

        Avion avion1 = getInstance("ABCD","TurkishAirline","jet");
        Passager p1 = new Passager("Dupont","Jean",3);
        avion1.ajoutPassagers(p1);

        Avion avion2 = getInstance("EFGH","Pegasus","jet");

        System.out.println("Avion1 -> Immatriculation: "+avion1.getImmatriculation()+", Marque: "+avion1.getMarque()+", Modele: "+avion1.getModele());
        System.out.println("Avion2 -> Immatriculation: "+avion2.getImmatriculation()+", Marque: "+avion2.getMarque()+", Modele: "+avion2.getModele());

        Avion avion3=transfert(avion1,avion2);

        System.out.println("Avion3 -> Immatriculation: "+avion3.getImmatriculation()+", Marque: "+avion3.getMarque()+", Modele: "+avion3.getModele());


    }
}
