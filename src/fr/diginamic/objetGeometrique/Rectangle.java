package fr.diginamic.objetGeometrique;

public class Rectangle implements ObjetGeometrique{

    public double longueur;
    public double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (this.largeur+this.largeur)*2;
    }

    @Override
    public double surface() {
        return this.largeur*this.longueur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
