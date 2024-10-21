package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison = new Maison();

        Piece wc = new WC(2,0);
        Piece salleDeBain = new SalleDeBain(5,0);
        Piece salon = new Salon(20,0);
        Piece cuisine = new Cuisine( 15, 0);

        Piece chambre = new Chambre ( 12, 1);
        Piece chambre2 = new Chambre ( 15, 1);
        Piece chambre3 = new Chambre ( 10, 1);
        Piece wc2 = new WC(2,1);
        Piece salleDeBain2 = new SalleDeBain(5,1);

        maison.ajouterPiece(wc);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(chambre3);
        maison.ajouterPiece(wc2);
        maison.ajouterPiece(salleDeBain2);


        System.out.println(maison.getSuperficieTotal());
        System.out.println(maison.getSuperficieEtage(0));
        System.out.println(maison.getSuperficieEtage(1));

        maison.ajouterPiece(null);
        Piece wc3 = new WC(0,-3);
        maison.ajouterPiece(wc3);

        System.out.println(maison.getSuperficieTotal());
        System.out.println(maison.getSuperficieEtage(0));
        System.out.println(maison.getSuperficieEtage(1));


        System.out.println(maison.getSuperficiePieces(chambre));
        System.out.println(maison.getSuperficiePieces(wc));
        System.out.println(maison.getSuperficiePieces(salleDeBain));


        System.out.println(maison.getSuperficiePieces(chambre));
        System.out.println(maison.getSuperficiePieces(wc));
        System.out.println(maison.getSuperficiePieces(salleDeBain));



    }
}
