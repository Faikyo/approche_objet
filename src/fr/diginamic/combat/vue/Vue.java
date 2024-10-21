package fr.diginamic.combat.vue;

import fr.diginamic.combat.modele.Personnage;
import fr.diginamic.combat.modele.Potion;
import fr.diginamic.combat.modele.PotionRobustesse;

import java.util.ArrayList;

public class Vue {

    public static void affichageMenu(){
        System.out.println("Bienvenu Aventurier dans ce jeu\n" +
                "Menu\n" +
                "1. Créer le personnage\n"+
                "2. Combattre une créature\n"+
                "3. Prendre une potion\n"+
                "4. Afficher score\n"+
                "5. Sortir\n");
    }

    public static void afficherScore(Personnage p){
        System.out.println("Le score du personnage est de "+p.score+"\n");
    }

    public static void fin(){
        System.out.println("Vous avez quittez le jeu");
    }

    public static void affichagePotion(ArrayList<Potion> inventaire){
        System.out.println("Vous pouvez consommer 1 des potions que vous possédez");
        for (int i =0; i<inventaire.size(); i++){
            System.out.println("Choix n°"+i+" "+inventaire.get(i).toString()+"\n");
        }

    }

    public static void mort(Personnage p){

        System.out.println("Votre personnage est décédé. Il a obtenu le score de "+p.score+" points.\n " +
                "Veuillez créer un nouveau personnage");
    }
}
