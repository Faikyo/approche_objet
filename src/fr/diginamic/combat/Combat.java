package fr.diginamic.combat;

import fr.diginamic.combat.modele.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static fr.diginamic.combat.vue.Vue.*;

public class Combat {

    public static Scanner sc = new Scanner(System.in);

    public static int choix;

    public static int tour;

    public static Personnage personnage;

    public static Creature creature;



    public static void main(String[] args) {



        affichageMenu();
        int choix = sc.nextInt();

        switch(choix){
            case 1 :
                creationDePersonnage();
                break;

            case 2 :
                creationCreature();
                if (personnage.sante>0){
                    creature.toString();
                    //TODO
                }
                else{
                    mort(personnage);
                }

            case 3:
                potion();
                break;

            case 4:
                afficherScore(personnage);
                break;
            case 5:
                fin();
                sc.close();
                break;

        }


    }

    public static void creationDePersonnage(){
        personnage = new Personnage();

        personnage.ajoutPotion(new PotionSoin());
        personnage.ajoutPotion(new PotionAttaque());
        personnage.ajoutPotion(new PotionRobustesse());
    }

    public static void creationCreature(){


        Creature loup = new Loup();
        Creature troll = new Troll();
        Creature gobelin = new Gobelin();

        creature = loup;
    }


    public static void combat(){

    }

    public static void potion(){
        int choixPotion;
        affichagePotion(personnage.inventaire);
        choixPotion= sc.nextInt();

        for(int i =0 ; i<personnage.inventaire.size(); i++){
            if(choixPotion==i){
                switch (personnage.inventaire.get(i).type){
                    case "SOIN":
                        personnage.sante+=personnage.inventaire.get(i).puissance;
                    case "ATTAQUE":
                        personnage.force+=personnage.inventaire.get(i).puissance;
                    case "ROBUSTESSE":
                        personnage.force+=personnage.inventaire.get(i).puissance;
                }
                personnage.inventaire.remove(i);
            }
        }
    }

}
