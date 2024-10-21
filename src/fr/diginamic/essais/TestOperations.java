package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {

        System.out.println(new Operations().calcul(3,5,'*'));
        System.out.println(new Operations().calcul(3,5,'-'));
        System.out.println(new Operations().calcul(3,5,'+'));
        System.out.println(new Operations().calcul(3,5,'/'));
    }
}
