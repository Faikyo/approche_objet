package fr.diginamic.instances.entites;

import java.util.ArrayList;

public class Avion {
    String immatriculation;
    String marque;
    String modele;
    Pilote pilote;
    ArrayList<Passager> tabPassagers= new ArrayList<>();

    public Avion(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public void ajoutPassagers(Passager p){
        this.tabPassagers.add(p);
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public void getTabPassagers() {
        for (Passager p : this.tabPassagers){
            System.out.println("["+p.nom+", "+p.prenom+", "+p.numSiege+"]");
        }
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }


}
