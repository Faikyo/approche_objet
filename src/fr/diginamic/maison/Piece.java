package fr.diginamic.maison;

public abstract class Piece {

    public double superficie;

    public int numEtage;

    public String type;

    public Piece(double superficie, int numEtage) {
        this.superficie = superficie;
        this.numEtage = numEtage;
    }
}
