package fr.diginamic.instances.entites;

public class Passager {
    String nom;
    String prenom;
    int numSiege;

    public Passager(String nom, String prenom, int numSiege) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSiege = numSiege;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumSiege() {
        return numSiege;
    }

    public void setNumSiege(int numSiege) {
        this.numSiege = numSiege;
    }
}
