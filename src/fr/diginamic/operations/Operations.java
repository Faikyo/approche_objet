package fr.diginamic.operations;

public class Operations {

    public double calcul(double a, double b, char c){

        switch (c){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Erreur : Division par zéro");
                    return Double.NaN;
                }
            default:
                System.out.println("Opération non valide");
                return Double.NaN;

        }
    }
}
