package fr.diginamic.combat;

import fr.diginamic.combat.modele.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static fr.diginamic.combat.NbAléatoire.getRandomNumber;
import static fr.diginamic.combat.vue.Vue.*;

public class Combat {

    public static Scanner sc = new Scanner(System.in);

    public static Personnage personnage ;

    public static Creature creature;



    public static void main(String[] args) {

        int choix;
        do{

            affichageMenu();
            choix = sc.nextInt();

            switch(choix){

                case 1 :
                    creationDePersonnage();
                    break;

                case 2 :
                    verificationBuff();
                    creature=creationCreature();
                    if (personnage.sante>0){
                        creature.toString();
                        combat();
                        break;
                    }
                    else{
                        mort(personnage);
                        break;
                    }

                case 3:
                    potion();
                    break;

                case 4:
                    System.out.println(personnage.toString());;
                    break;
                case 5:
                    fin();
                    sc.close();
                    break;

            }

        }while (choix!=5);



    }

    public static void creationDePersonnage(){
        personnage = new Personnage();

        personnage.ajoutPotion(new PotionSoin());
        personnage.ajoutPotion(new PotionAttaque());
        personnage.ajoutPotion(new PotionRobustesse());

        System.out.println(personnage.toString());;
    }

    public static Creature creationCreature() {
        Random random = new Random();
        int choix = random.nextInt(3);

        Creature creature = null;

        switch (choix) {
            case 0:
                creature = new Loup();
                System.out.println("Un Loup a été créé !\n");
                break;
            case 1:
                creature = new Troll();
                System.out.println("Un Troll a été créé !\n");
                break;
            case 2:
                creature = new Gobelin();
                System.out.println("Un Gobelin a été créé !\n");
                break;
            default:
                System.out.println("Aucune créature n'a été créée.\n");
                break;
        }

        return creature;
    }


    public static void combat(){

        int tour =0;
        while(personnage.sante>0 || creature.sante >0){

            tour++;
            System.out.println("Tour n°"+tour+"\n");

            int attaquePersonnage = personnage.force+getRandomNumber(1,10);
            System.out.println("Le personage à "+personnage.sante+" de sante\n");
            System.out.println("L'attaque du personnage est de "+attaquePersonnage+"\n");

            int attaqueCreature = creature.force+getRandomNumber(1,10);
            System.out.println("La creature à "+creature.sante+" de sante\n");
            System.out.println("L'attaque du creature est de "+ attaqueCreature+"\n");

            if( attaquePersonnage > attaqueCreature){
                if(creature.sante - (attaquePersonnage-attaqueCreature)>0){
                    creature.sante -= attaquePersonnage - attaqueCreature;
                    System.out.println("La creature à maintenant "+creature.sante+" de sante\n");
                }
                else {
                    System.out.println("Félicitation vous avez gagnez le combat"+"\n");
                    personnage.score+=creature.score;
                    obtenirRecompense(50);
                    System.out.println("Vous avez maintenant  "+personnage.score+" de score\n");
                    break;
                }
            }
            else {
                if (personnage.sante - (attaqueCreature-attaquePersonnage)>0){
                    personnage.sante -= attaqueCreature-attaquePersonnage;
                    System.out.println("Le personnage à maintenant "+personnage.sante+" de sante\n");
                }
                else {
                    mort(personnage);
                    break;
                }
            }
        }

    }

    public static void potion(){
        int choixPotion;
        affichagePotion(personnage.inventaire);
        choixPotion= sc.nextInt();

        switch (personnage.inventaire.get(choixPotion).type){
            case "SOIN":
                System.out.println("SOIN");
                personnage.sante+=personnage.inventaire.get(choixPotion).puissance;
                personnage.utilisationPotion(personnage.inventaire.get(choixPotion));
                break;
            case "ATTAQUE":
                System.out.println("ATTAQUE");
                personnage.force+=personnage.inventaire.get(choixPotion).puissance;
                personnage.utilisationPotion(personnage.inventaire.get(choixPotion));
                break;
            case "ROBUSTESSE":
                System.out.println("ROBUSTESSE");
                personnage.force+=personnage.inventaire.get(choixPotion).puissance;
                personnage.utilisationPotion(personnage.inventaire.get(choixPotion));
                break;
        }
    }

    public static void obtenirRecompense(int chance) {
        Random random = new Random();

        if (random.nextInt(100) < chance) {

            int recompense = random.nextInt(4);
            switch (recompense) {
                case 0:
                    Potion pSoin = new PotionSoin();
                    personnage.inventaire.add(pSoin);
                    System.out.println("Vous avez obtenu une Potion de soin : +" + pSoin.puissance + " points de santé.");
                    break;
                case 1:
                    Potion pAttaque = new PotionAttaque();
                    personnage.inventaire.add(pAttaque);
                    System.out.println("Vous avez obtenu une Potion d'attaque mineure : +3 points d'attaque pour le prochain combat.");
                    break;
                case 2:
                    Potion pRobustesse = new PotionRobustesse();
                    personnage.inventaire.add(pRobustesse);
                    System.out.println("Vous avez obtenu une Potion d'attaque majeure : +5 points d'attaque pour les 2 prochains combats.");
                    break;
                case 3:
                    personnage.score+=5;
                    System.out.println("Vous avez obtenu une récompense de score : +5 points de score.");
                    break;
            }
        } else {
            System.out.println("Vous n'avez obtenu aucune récompense.");
        }
    }

    public static void verificationBuff(){

        for (int i =0; i<personnage.buff.size();i++){
            if(personnage.buff.get(i).type=="ATTAQUE"){
                if (personnage.buff.get(i).duree>0){
                    personnage.buff.get(i).duree--;
                }
                else {
                    personnage.force -= personnage.buff.get(i).puissance;
                    System.out.println("L'effet de la potion d'ATTAQUE à pris fin, vous perdez "+personnage.buff.get(i).puissance+" de force"+"\n");
                    personnage.buff.remove(i);

                }
            } else if (personnage.buff.get(i).type=="ROBUSTESSE") {
                if (personnage.buff.get(i).duree>0){
                    personnage.buff.get(i).duree--;
                }
                else {
                    personnage.force -= personnage.buff.get(i).puissance;
                    System.out.println("L'effet de la potion de Robustesse à pris fin, vous perdez "+personnage.buff.get(i).puissance+" de force"+"\n");
                    personnage.buff.remove(i);
                }

            }
        }

    }

}
