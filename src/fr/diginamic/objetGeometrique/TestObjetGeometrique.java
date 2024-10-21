package fr.diginamic.objetGeometrique;

import java.util.ArrayList;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique[] tab = new ObjetGeometrique[4];

        tab[0] = new Cercle(4);
        tab[1] = new Carre( 3);
        tab[2] = new Sphere(6);
        tab[3] = new Rectangle(2,7);

        for ( ObjetGeometrique obj : tab){
            System.out.println(obj.toString());
            System.out.println("Perimetre: "+obj.perimetre()+", Surface: "+obj.surface()+"\n");
        }

        ArrayList<Objet3D> tab3D = new ArrayList<>();

        tab3D.add(new Sphere(6));
        //tab3D[0] = new Cercle(4);
        //tab3D[1] = new Carre(3);
        //tab3D[3] = new Rectangle(2,7);

        for ( Objet3D obj : tab3D){
            System.out.println(obj.toString());
            System.out.println("Volume: "+obj.volume()+"\n");
        }
    }
}
