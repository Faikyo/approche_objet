package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {

        Theatre theatre =new Theatre("PatheOrleans",50,47,470);


        theatre.inscrire(4,10);

        System.out.println(theatre);;
    }
}
