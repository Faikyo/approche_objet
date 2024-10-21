package fr.diginamic.objetGeometrique;

public class Carre extends Rectangle{

    public Carre(double longueur, double largeur) {
        super(longueur, largeur);
    }

    @Override
    public String toString() {
        return "Carre{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
