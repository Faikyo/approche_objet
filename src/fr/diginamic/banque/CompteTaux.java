package fr.diginamic.banque;

public class CompteTaux extends Compte{

    private double taux;

    public CompteTaux(int num, int solde, double taux) {
        super(num, solde);
        this.taux=taux;

    }

    @Override
    public String toString() {
        return super.toString()+", " +
                "tauxDeRemuneration=" + taux ;
    }
}
