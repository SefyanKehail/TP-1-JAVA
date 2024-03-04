package main;

import metier.Cercle;
import metier.Rectangle;

public class Main {
    public static void main(String[] args) {
        // les calcules sont inclues dans la classe Figure, methode afficherDetails()

        // Cercle
        System.out.println("***** Cercle *****");
        Cercle cercle = new Cercle("CercleNom",10);
        cercle.afficherDetails();

        // Rectangle
        System.out.println("\n");
        System.out.println("***** Rectangle *****");
        Rectangle rectangle = new Rectangle("RectangleNom", 10, 10);
        rectangle.afficherDetails();
    }
}
