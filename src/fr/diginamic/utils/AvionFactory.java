package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;

public class AvionFactory {

    public static Avion getInstance(String immatriculation, String marque, String modele){
        return new Avion(immatriculation,marque,modele);
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
            for (Passager p : avion1.getTabPassagers()) {
                avion2.ajoutPassagers(p);
            }
            return avion2;
        }
    }

}
