package fr.diginamic.entites;

public class Theatre {

    public String nom;

    public int capaciteMax;

    public int clientsInscrits;

    public double recetteTotal;

    public Theatre(String nom, int capaciteMax, int clientsInscrits, double recetteTotal) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.clientsInscrits = clientsInscrits;
        this.recetteTotal = recetteTotal;
    }

    public void inscrire(int nbClients, double prixPlace){

        for (int i =0; i<nbClients; i++){
            if(clientsInscrits+1<=capaciteMax){
                clientsInscrits++;
                recetteTotal+=prixPlace;
            }
            else{
                System.out.println("Capacite max atteint");
            }
        }
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "nom='" + nom + '\'' +
                ", capaciteMax=" + capaciteMax +
                ", clientsInscrits=" + clientsInscrits +
                ", recetteTotal=" + recetteTotal +
                '}';
    }
}
