package fr.diginamic.objetGeometrique;

public class Sphere implements Objet3D {

    public double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }



    @Override
    public double volume() {
        return 4/3*Math.PI*Math.pow(this.rayon,3);
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
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}
