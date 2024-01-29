package UF2.SegonNombreMesGran;

import java.util.Scanner;

public class SegonNMesGran {

    // Declaració de variables globals
    private static Scanner lector = new Scanner(System.in);
    private static double primerNombre, segonNombre, tercerNombre, quartNombre, cinqueNombre;

    public static void main(String[] args) {
        // Demanar i llegir els nombres
        demanarNombres();

        // Creació d'un array amb els nombres introduïts
        double[] nombres = {primerNombre, segonNombre, tercerNombre, quartNombre, cinqueNombre};

        // Inicialització de les variables per als nombres més grans
        double mesGran = 0;
        double segonMesGran = 0;

        // Bucle per trobar el segon nombre més gran
        for (double nombre : nombres) {
            if (nombre > mesGran) {
                segonMesGran = mesGran;
                mesGran = nombre;
            }
            else if (nombre > segonMesGran && nombre != mesGran) {
                segonMesGran = nombre;
            }
        }

        // Mostrar el resultat
        if (mesGran == segonMesGran) {
            System.out.println("HAS INTRODUÏT ELS MATEIXOS NOMBRES, PER TANT, NO N'HI HA CAP DE MÉS GRAN");
        }
        else {
            System.out.println("EL SEGON NOMBRE MÉS GRAN ÉS " + segonMesGran + "!");
        }
    }

    // Mètode per demanar i llegir els nombres a l'usuari
    private static void demanarNombres() {
        primerNombre = demanarNombre("PRIMER");
        segonNombre = demanarNombre("SEGON");
        tercerNombre = demanarNombre("TERCER");
        quartNombre = demanarNombre("QUART");
        cinqueNombre = demanarNombre("CINQUE");
    }

    // Mètode per demanar un nombre a l'usuari amb gestió d'errors
    private static double demanarNombre(String ordre) {
        double nombre = 0;

        // Sol·licitar a l'usuari que introdueixi el nombre
        System.out.println("ESCRIU EL " + ordre + " NOMBRE");

        // Bucle per gestionar errors d'entrada
        while (!lector.hasNextDouble()) {
            System.out.println("ALERTA! NO S'ACCEPTEN CARÀCTERS QUE NO SIGUIN NOMBRES");
            lector.next(); // Consumir la entrada incorrecta
            System.out.println("ESCRIU EL " + ordre + " NOMBRE");
        }

        // Llegir el nombre vàlid
        nombre = lector.nextDouble();
        return nombre;
    }
}
