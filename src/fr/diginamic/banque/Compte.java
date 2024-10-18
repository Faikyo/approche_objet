package fr.diginamic.banque;

public class Compte {

    private int numCompte ;
    private int soldeCompte;

    Compte(int numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}
