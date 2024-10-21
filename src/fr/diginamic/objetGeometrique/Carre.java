package fr.diginamic.objetGeometrique;

public class Carre extends Rectangle{

    public Carre(double cote) {
        super(cote, cote);
    }

    @Override
    public String toString() {
        return "Carre{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
