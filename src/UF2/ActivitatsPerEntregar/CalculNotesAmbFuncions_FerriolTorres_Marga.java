package UF2.ActivitatsPerEntregar;
import java.util.Scanner;
public class CalculNotesAmbFuncions_FerriolTorres_Marga {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int quantitat = 5;
        double[] notes = new double[quantitat];
        //PARÀMETRES D'ENTRADA()
        //PARÀMETRES DE SORTIDA QUAN IGUALAM A ALGUNA COSA
        mostrarMenu();
        llegirDades(notes);

        double max = calculaMax(notes);
        double min = calculaMin(notes);
        double mitjana = calculaMitjana(notes);

        imprimir(max, min, mitjana);
    }

    public static void mostrarMenu() {
        System.out.println("BENVINGUT AL PROCESSAMENT DE NOTES:");
        System.out.println("---------------------------------------------");
    }

    public static void llegirDades(double[] notes) {
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Introdueix la nota " + (i + 1) + ": ");
            while (!lector.hasNextDouble()) {
                System.out.println("Entrada no vàlida. Introdueix una nota vàlida.");
                lector.next();
                System.out.print("Introdueix la nota " + (i + 1) + ": ");
            }
            notes[i] = lector.nextDouble();
        }
    }

    public static double calculaMax(double[] notes) {
        double max = notes[0];

        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }

        return max;
    }

    public static double calculaMin(double[] notes) {
        double min = notes[0];

        for (int i = 1; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }

        return min;
    }

    public static double calculaMitjana(double[] notes) {
        double suma = 0;

        for (double nota : notes) {
            suma += nota;
        }

        return suma / notes.length;
    }

    public static void imprimir(double max, double min, double mitjana) {
        System.out.println("---------------------------------------------");
        System.out.println("ELS RESULTATS SÓN: ");
        System.out.println("La nota màxima és: " + max);
        System.out.println("--------------------------");
        System.out.println("La nota mínima és: " + min);
        System.out.println("--------------------------");
        System.out.println("La mitjana és: " + mitjana);
        System.out.println("--------------------------");
    }
}
