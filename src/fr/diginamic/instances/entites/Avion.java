package fr.diginamic.instances.entites;

public class Avion {
    String immatriculation;
    String marque;
    String modele;
    Pilote pilote;
    Passager[] tabPassagers;

    public Avion(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Passager[] getTabPassagers() {
        return tabPassagers;
    }

    public void setTabPassagers(Passager[] tabPassagers) {
        this.tabPassagers = tabPassagers;
    }
}
