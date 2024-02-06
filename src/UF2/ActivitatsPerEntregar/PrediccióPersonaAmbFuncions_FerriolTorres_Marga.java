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
        if (mes.equalsIgnoreCase("Gener")) {
            numSort = edat * 3 / 2;
        }
        else if (mes.equalsIgnoreCase("Febrer")) {
            numSort = edat - 4;
        }
        else if (mes.equalsIgnoreCase("Març")) {
            numSort = edat / 2;
        }
        else if (mes.equalsIgnoreCase("Abril")) {
            numSort = edat % 4;
        }
        else if (mes.equalsIgnoreCase("Maig")) {
            numSort = edat * 3 / 6;
        }
        else if (mes.equalsIgnoreCase("Juny")) {
            numSort = edat + edat;
        }
        else if (mes.equalsIgnoreCase("Juliol")) {
            numSort = edat * edat / 5;
        }
        else if (mes.equalsIgnoreCase("Agost")) {
            numSort = edat * 0.5 * edat;
        }
        else if (mes.equalsIgnoreCase("Setembre")) {
            numSort = edat / edat;
        }
        else if (mes.equalsIgnoreCase("Octubre")) {
            numSort = edat * 4 / 3;
        }
        else if (mes.equalsIgnoreCase("Novembre")) {
            numSort = edat % 2 + 23;
        }
        else if (mes.equalsIgnoreCase("Desembre")) {
            numSort = (edat + edat) / 2;
        }
        return numSort;
    }

    public static String determinarEquipFutbol(String mesNaixement) {
        String equipFutbol = "";

        if (mesNaixement.equalsIgnoreCase("Gener")) {
            equipFutbol = "Bayern de Munich";
        }
        else if (mesNaixement.equalsIgnoreCase("Febrer")) {
            equipFutbol = "Atlético de Madrid";
        }
        else if (mesNaixement.equalsIgnoreCase("Març")) {
            equipFutbol = "Chelsea";
        }
        else if (mesNaixement.equalsIgnoreCase("Abril")) {
            equipFutbol = "Manchester City";
        }
        else if (mesNaixement.equalsIgnoreCase("Maig")) {
            equipFutbol = "Liverpool";
        }
        else if (mesNaixement.equalsIgnoreCase("Juny")) {
            equipFutbol = "Real Madrid";
        }
        else if (mesNaixement.equalsIgnoreCase("Juliol")) {
            equipFutbol = "BVB";
        }
        else if (mesNaixement.equalsIgnoreCase("Agost")) {
            equipFutbol = "FCB";
        }
        else if (mesNaixement.equalsIgnoreCase("Setembre")) {
            equipFutbol = "Juve";
        }
        else if (mesNaixement.equalsIgnoreCase("Octubre")) {
            equipFutbol = "PSG";
        }
        else if (mesNaixement.equalsIgnoreCase("Novembre")) {
            equipFutbol = "Sevilla CF";
        }
        else if (mesNaixement.equalsIgnoreCase("Desembre")) {
            equipFutbol = "Manchester United";
        }
        else {
            equipFutbol = "No tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
        }

        return equipFutbol;
    }

    public static String identificarLlenguatgeProgramacio(String mes) {
        String llenguatgeProgramacio = "";

        if (mes.equalsIgnoreCase("Gener")) {
            llenguatgeProgramacio = "C++";
        }
        else if (mes.equalsIgnoreCase("Febrer")) {
            llenguatgeProgramacio = "Python";
        }
        else if (mes.equalsIgnoreCase("Març")) {
            llenguatgeProgramacio = "JavaScript";
        }
        else if (mes.equalsIgnoreCase("Abril")) {
            llenguatgeProgramacio = "Node.js";
        }
        else if (mes.equalsIgnoreCase("Maig")) {
            llenguatgeProgramacio = "React";
        }
        else if (mes.equalsIgnoreCase("Juny")) {
            llenguatgeProgramacio = "C#";
        }
        else if (mes.equalsIgnoreCase("Juliol")) {
            llenguatgeProgramacio = "Swift";
        }
        else if (mes.equalsIgnoreCase("Agost")) {
            llenguatgeProgramacio = "Java";
        }
        else if (mes.equalsIgnoreCase("Setembre")) {
            llenguatgeProgramacio = "PHP";
        }
        else if (mes.equalsIgnoreCase("Octubre")) {
            llenguatgeProgramacio = "R";
        }
        else if (mes.equalsIgnoreCase("Novembre")) {
            llenguatgeProgramacio = "Go";
        }
        else if (mes.equalsIgnoreCase("Desembre")) {
            llenguatgeProgramacio = "Ruby";
        }
        else {
            llenguatgeProgramacio = "No tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
        }

        return llenguatgeProgramacio;
    }

    public static void mostrarResultats(String nom, double numSort, String equipFutbol, String llenguatgeProgramacio) {
        if (equipFutbol.equals("")) {
            System.out.println("IMPORTANT! \nMes no vàlid. Si us plau, introdueix un mes vàlid.");
        }
        else {
            System.out.println("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu...\n>>> El teu número de la sort és el: " + numSort + "!\n>>> El teu equip de futbol preferit, encara que no ho diguis en veu alta, és el: " + equipFutbol + "\n>>> El teu llenguatge de programació més estimat serà: " + llenguatgeProgramacio + "\nTorna quan vulguis!");
        }
    }
}
