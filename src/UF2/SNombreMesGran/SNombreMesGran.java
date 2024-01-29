package UF2.SNombreMesGran;

import java.util.Scanner;
public class SNombreMesGran {
    public static void main (String[] args) {
        System.out.print("Escriu la longitut que vols que sigui el vector: ");
        Scanner lector = new Scanner(System.in);
        int longitut = lector.nextInt();
        int[] vector = new int[longitut];

        System.out.println("Ara escriu els valors del vector.");

        for (int i = 0; i < longitut; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector[i] = lector.nextInt();
        }

        int primerMax = 0;
        int segonMax = 0;
        for (int i = 1; i < longitut; i++) {
            if (vector[i] > primerMax) {
                segonMax = primerMax;
                primerMax = vector[i];
            }
            else if (vector[i] > segonMax && vector[i] != primerMax) {
                segonMax = vector[i];
            }
        }

        if (segonMax == primerMax) {
            System.out.println("No hi ha segon nombre més gran");
        } else {
            System.out.println("El segon nombre més gran és el: " + segonMax);
        }

    }
}