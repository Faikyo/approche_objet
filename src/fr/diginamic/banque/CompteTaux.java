package fr.diginamic.banque;

public class CompteTaux extends Compte{

    public int tauxDeRemuneration;

    public CompteTaux(int numCompte, int soldeCompte, int tauxDeRemuneration) {
        super(numCompte, soldeCompte);
        this.tauxDeRemuneration=tauxDeRemuneration;

    }

    @Override
    public String toString() {
        return super.toString()+"CompteTaux{" +
                "tauxDeRemuneration=" + tauxDeRemuneration +
                '}';
    }
}
