package UF2.ActivitatsPerEntregar;
import java.util.Scanner;
public class PrediccióPersonaAmbFuncions_FerriolTorres_Marga {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String mes = obtenirMes(lector);
        String nom = obtenirNom(lector);
        int edat = obtenirEdat(lector);

        double numSort = calcularNumSort(mes, edat);
        String equipFutbol = determinarEquipFutbol(mes);
        String llenguatgeProgramacio = identificarLlenguatgeProgramacio(mes);

        mostrarResultats(nom, numSort, equipFutbol, llenguatgeProgramacio);
    }

    public static String obtenirMes(Scanner lector) {
        System.out.println("En quin mes has nascut?");
        System.out.println("|   Gener    |   Febrer   |    Març    |");
        System.out.println("|   Abril    |    Maig    |    Juny    |");
        System.out.println("|   Juliol   |    Agost   |  Setembre  |");
        System.out.println("|  Octubre   |  Novembre  |  Desembre  |");
        return lector.nextLine();
    }

    public static String obtenirNom(Scanner lector) {
        System.out.println("Que et diuen?");
        return lector.nextLine();
    }

    public static int obtenirEdat(Scanner lector) {
        System.out.println("Quina edat tens?");
        return lector.nextInt();
    }

    public static double calcularNumSort(String mes, int edat) {
        double numSort = 0;
        if (mes.equalsIgnoreCase("GENER")) {
            numSort = edat * 3 / 2;
        } else if (mes.equalsIgnoreCase("FEBRER")) {
            numSort = edat - 4;
        } else if (mes.equalsIgnoreCase("MARÇ")) {
            numSort = edat / 2;
        } else if (mes.equalsIgnoreCase("ABRIL")) {
            numSort = edat % 4;
        } else if (mes.equalsIgnoreCase("MAIG")) {
            numSort = edat * 3 / 6;
        } else if (mes.equalsIgnoreCase("JUNY")) {
            numSort = edat + edat;
        } else if (mes.equalsIgnoreCase("JULIOL")) {
            numSort = edat * edat / 5;
        } else if (mes.equalsIgnoreCase("AGOST")) {
            numSort = edat * 0.5 * edat;
        } else if (mes.equalsIgnoreCase("SETEMBRE")) {
            numSort = edat / edat;
        } else if (mes.equalsIgnoreCase("OCTUBRE")) {
            numSort = edat * 4 / 3;
        } else if (mes.equalsIgnoreCase("NOVEMBRE")) {
            numSort = edat % 2 + 23;
        } else if (mes.equalsIgnoreCase("DESEMBRE")) {
            numSort = (edat + edat) / 2;
        }
        return numSort;
    }

    public static String determinarEquipFutbol(String mes) {
        switch (mes.toUpperCase()) {
            case "GENER":
                return "FC BAYERN";
            case "FEBRER":
                return "ATLÈTIC DE MADRID";
            case "MARÇ":
                return "CHELSEA";
            case "ABRIL":
                return "MANCHESTER CITY";
            case "MAIG":
                return "LIVERPOOL";
            case "JUNY":
                return "REAL MADRID";
            case "JULIOL":
                return "BVB 09";
            case "AGOST":
                return "BARÇA";
            case "SETEMBRE":
                return "JUVENTUS";
            case "OCTUBRE":
                return "PSG";
            case "NOVEMBRE":
                return "SEVILLA";
            case "DESEMBRE":
                return "MANCHESTER UNITED";
            default:
                return "";
        }
    }

    public static String identificarLlenguatgeProgramacio(String mes) {
        switch (mes.toUpperCase()) {
            case "GENER":
                return "C++";
            case "FEBRER":
                return "PYTHON";
            case "MARÇ":
                return "JAVASCRIPT";
            case "ABRIL":
                return "NODE.JS";
            case "MAIG":
                return "REACT";
            case "JUNY":
                return "C#";
            case "JULIOL":
                return "SWIFT";
            case "AGOST":
                return "JAVA";
            case "SETEMBRE":
                return "PHP";
            case "OCTUBRE":
                return "R";
            case "NOVEMBRE":
                return "GO";
            case "DESEMBRE":
                return "RUBY";
            default:
                return "";
        }
    }

    public static void mostrarResultats(String nom, double numSort, String equipFutbol, String llenguatgeProgramacio) {
        if (equipFutbol.equals("")) {
            System.out.println("IMPORTANT! \nMes no vàlid. Si us plau, introdueix un mes vàlid.");
        } else {
            System.out.println("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu...\n>>> El teu número de la sort és el: " + numSort + "!\n>>> El teu equip de futbol preferit, encara que no ho diguis en veu alta, és el: " + equipFutbol + "\n>>> El teu llenguatge de programació més estimat serà: " + llenguatgeProgramacio + "\nTorna quan vulguis!");
        }
    }
}
