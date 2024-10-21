package fr.diginamic.banque;

public class TestOperation {

    public static void main(String[] args) {

        Operation[] tabOperations = new Operation[4];

        tabOperations[0]=new Credit("12/04/2023", 20000);
        tabOperations[1]=new Credit("13/05/2023", 10000);
        tabOperations[2]=new Debit("06/08/2024", 1500);
        tabOperations[3]=new Debit("25/07/2024", 2700);

        for (Operation op : tabOperations){
            System.out.println("Date de l'operation: "+ op.getDate()+"\n"+
                    "Montant de l'operation: "+ op.getMontant()+"\n"+
                    "Type de l'operation: "+ op.getType()+"\n");
        }

        double montantGlobal = 0;

        for (Operation op : tabOperations){
            if (op.getType() == "CREDIT"){
                montantGlobal+= op.getMontant();
            }
            else {
                montantGlobal-= op.getMontant();
            }
        }
        System.out.println("Le montant global est de "+ montantGlobal);
    }
}
