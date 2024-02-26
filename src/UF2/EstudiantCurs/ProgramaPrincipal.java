package UF2.EstudiantCurs;
import java.util.Scanner;
public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        Estudiant estudiant = new Estudiant();

        System.out.print("Introdueix el nom de l'estudiant: ");
        String nomEstudiant = lector.nextLine();

        System.out.print("Introdueix l'edat de l'estudiant: ");
        int edatEstudiant =obtenirEdat(lector);
        lector.nextLine();

        estudiant.mostrarInformacio(nomEstudiant, edatEstudiant);
        System.out.println("L'estudiant és major d'edat? " + estudiant.esMajorEdat(edatEstudiant));
        estudiant.saludar(nomEstudiant);

        Curs curs = new Curs();

        System.out.print("\nIntrodueix el nom del curs: ");
        String nomCurs = lector.nextLine();

        System.out.print("Introdueix la quantitat de crèdits del curs: ");
        int creditsCurs = lector.nextInt();

        curs.mostrarInformacio(nomCurs, creditsCurs);
        System.out.println("Quantitat d'hores del curs: " + curs.obtenirHores(creditsCurs));
    }
    private static int obtenirEdat(Scanner lector) {
        int edat = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Introdueix l'edat de l'estudiant: ");

            if (lector.hasNextInt()) {
                edat = lector.nextInt();
                entradaValida = true;
            }
            else {
                System.out.println("Error: Introdueix un número vàlid per a l'edat.");
                lector.next();
            }
        }
        return edat;
    }
}