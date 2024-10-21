package fr.diginamic.objetGeometrique;

public class Cercle implements ObjetGeometrique{

    public double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return this.rayon*2*Math.PI;
    }

    @Override
    public double surface() {
        return Math.PI*Math.pow(this.rayon,2);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}

