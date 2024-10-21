package fr.diginamic.banque;

public class Compte {

    private int num ;
    private double solde;

    Compte(int numCompte, int soldeCompte) {
        this.num = numCompte;
        this.solde = soldeCompte;
    }

    public int getNumCompte() {
        return num;
    }

    public double getSoldeCompte() {
        return solde;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.solde = soldeCompte;
    }

    @Override
    public String toString() {
        return "numCompte=" + num +
                ", soldeCompte=" + solde;
    }
}
