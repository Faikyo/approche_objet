package fr.diginamic.instances.entites;

import java.util.Date;

public class Pilote {
    String nom;
    String prenom;
    Date dateLicence;

    public Pilote(String nom, String prenom, Date dateLicence) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateLicence = dateLicence;
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

    public Date getDateLicence() {
        return dateLicence;
    }

    public void setDateLicence(Date dateLicence) {
        this.dateLicence = dateLicence;
    }
}
