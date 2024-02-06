package UF2.CalcularArees;

import java.util.Scanner;

public class Cercle {
    public static double areaCercle(Scanner scanner) {
        System.out.println("Quin es el radi del cercle?");
        double r = scanner.nextDouble();
        return Math.pow(r, 2) * Math.PI;
    }
}
