import java.util.Scanner;

public class PrediccioPersona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escriu el mes en què vas néixer.\nGener\tFebrer\tMarc\nAbril\tMaig\tJuny\nJuliol\tAgost\tSetembre\nOctubre\tNovembre\tDesembre\n\n");

        String mesNaixement = s.nextLine();

        System.out.print("\nCom et dius?\n");
        String nom = s.nextLine();

        System.out.print("\nPer acabar, quants anys tens?\n");
        int edat = s.nextInt();

        System.out.print("\n\n");

        int numSort = calcularNumSort(mesNaixement, edat);
        String equipFutbol = calcularFutbol(mesNaixement);
        String llenguatgeProgramacio = calcularLlenguatge(mesNaixement);

        mostrarResultats(nom, numSort, equipFutbol, llenguatgeProgramacio);
    }

    static int calcularNumSort(String mesNaixement, int edat) {
        int numSort = 0;

        if (mesNaixement.equalsIgnoreCase("Gener")) {
            numSort = edat * 3 / 2;
        } else if (mesNaixement.equalsIgnoreCase("Febrer")) {
            numSort = edat - 4;
        } else if (mesNaixement.equalsIgnoreCase("Marc")) {
            numSort = edat / 2;
        } else if (mesNaixement.equalsIgnoreCase("Abril")) {
            numSort = edat % 4;
        } else if (mesNaixement.equalsIgnoreCase("Maig")) {
            numSort = edat * 3 / 6;
        } else if (mesNaixement.equalsIgnoreCase("Juny")) {
            numSort = edat + edat;
        } else if (mesNaixement.equalsIgnoreCase("Juliol")) {
            numSort = edat * edat / 5;
        } else if (mesNaixement.equalsIgnoreCase("Agost")) {
            numSort = edat * 1 / 2 * edat;
        } else if (mesNaixement.equalsIgnoreCase("Setembre")) {
            numSort = edat / edat;
        } else if (mesNaixement.equalsIgnoreCase("Octubre")) {
            numSort = edat * 4 / 3;
        } else if (mesNaixement.equalsIgnoreCase("Novembre")) {
            numSort = edat % 2 + 23;
        } else if (mesNaixement.equalsIgnoreCase("Desembre")) {
            numSort = (edat + edat) / 2;
        } else {
            numSort = 0;
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }

        return numSort;
    }

    static String calcularFutbol(String mesNaixement) {
        String equipFutbol = "";

        if (mesNaixement.equalsIgnoreCase("Gener")) {
            equipFutbol = "Bayern de Munich";
        } else if (mesNaixement.equalsIgnoreCase("Febrer")) {
            equipFutbol = "Atlético de Madrid";
        } else if (mesNaixement.equalsIgnoreCase("Marc")) {
            equipFutbol = "Chelsea";
        } else if (mesNaixement.equalsIgnoreCase("Abril")) {
            equipFutbol = "Manchester City";
        } else if (mesNaixement.equalsIgnoreCase("Maig")) {
            equipFutbol = "Liverpool";
        } else if (mesNaixement.equalsIgnoreCase("Juny")) {
            equipFutbol = "Real Madrid";
        } else if (mesNaixement.equalsIgnoreCase("Juliol")) {
            equipFutbol = "BVB";
        } else if (mesNaixement.equalsIgnoreCase("Agost")) {
            equipFutbol = "FCB";
        } else if (mesNaixement.equalsIgnoreCase("Setembre")) {
            equipFutbol = "Juve";
        } else if (mesNaixement.equalsIgnoreCase("Octubre")) {
            equipFutbol = "PSG";
        } else if (mesNaixement.equalsIgnoreCase("Novembre")) {
            equipFutbol = "Sevilla CF";
        } else if (mesNaixement.equalsIgnoreCase("Desembre")) {
            equipFutbol = "Manchester United";
        } else {
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
        }

        return equipFutbol;
    }

    static String calcularLlenguatge(String mesNaixement) {
        String llenguatgeProgramacio = "";

        if (mesNaixement.equalsIgnoreCase("Gener")) {
            llenguatgeProgramacio = "C++";
        } else if (mesNaixement.equalsIgnoreCase("Febrer")) {
            llenguatgeProgramacio = "Python";
        } else if (mesNaixement.equalsIgnoreCase("Marc")) {
            llenguatgeProgramacio = "JavaScript";
        } else if (mesNaixement.equalsIgnoreCase("Abril")) {
            llenguatgeProgramacio = "Node.js";
        } else if (mesNaixement.equalsIgnoreCase("Maig")) {
            llenguatgeProgramacio = "React";
        } else if (mesNaixement.equalsIgnoreCase("Juny")) {
            llenguatgeProgramacio = "C#";
        } else if (mesNaixement.equalsIgnoreCase("Juliol")) {
            llenguatgeProgramacio = "Swift";
        } else if (mesNaixement.equalsIgnoreCase("Agost")) {
            llenguatgeProgramacio = "Java";
        } else if (mesNaixement.equalsIgnoreCase("Setembre")) {
            llenguatgeProgramacio = "PHP";
        } else if (mesNaixement.equalsIgnoreCase("Octubre")) {
            llenguatgeProgramacio = "R";
        } else if (mesNaixement.equalsIgnoreCase("Novembre")) {
            llenguatgeProgramacio = "Go";
        } else if (mesNaixement.equalsIgnoreCase("Desembre")) {
            llenguatgeProgramacio = "Ruby";
        } else {
            llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
        }

        return llenguatgeProgramacio;
    }

    static void mostrarResultats(String nom, int numSort, String equipFutbol, String llenguatgeProgramacio) {
        System.out.print("------------------------------------------------\n");
        System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n\n");
        System.out.print(">>> El teu número de la sort és el " + numSort + "!\n\n");
        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".\n\n");
        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!\n\n");
        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }
}
