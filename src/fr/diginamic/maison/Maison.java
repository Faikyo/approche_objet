package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {

    public double superficieTotal;

    public ArrayList<Piece> maison = new ArrayList<>();


    public void ajouterPiece(Piece piece){
        if (piece != null && piece.numEtage>=0 && piece.superficie>0) {
            maison.add(piece);
            superficieTotal += piece.superficie;
        }
    }

    public double getSuperficieTotal() {
        return superficieTotal;
    }

    public double getSuperficieEtage(int etage){
        double res = 0;
        for(Piece piece : maison){
            if ( piece.numEtage == etage && piece.superficie>0){
                res+=piece.superficie;
            }
        }
        return res;
    }


    public double getSuperficiePieces( Piece typePiece ){
        double res =0;
        for (Piece p : maison){
            if(p.type.equals(typePiece.type)){
                res+=typePiece.superficie;
            }
        }
        return res;
    }

    public int getNbPieces(Piece typePiece) {
        int res =0;
        for (Piece p : maison){
            if(p.type.equals(typePiece.type)){
                res++;
            }
        }
        return res;

    }
}
