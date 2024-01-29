package UF2.ActivitatsPerEntregar;

import java.util.Scanner;

public class CalculAreesAmbFuncions_FerriolTorres_Marga {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("De quina figura vols calcular l'àrea?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paral·lelogram o cercle.\n");

        String figura = scanner.nextLine();

        double area = calcularArea(figura, scanner);

        System.out.println("L'àrea del " + figura + " és " + area);
    }

    public static double calcularArea(String figura, Scanner scanner) {
        double area = 0;

        if (figura.equalsIgnoreCase("TRIANGLE")) {
            area = areaTriangle();
        }
        else if (figura.equalsIgnoreCase("QUADRAT")) {
            area = areaQuadrat();
        }
        else if (figura.equalsIgnoreCase("RECTANGLE")) {
            area = areaRectangle();
        }
        else if (figura.equalsIgnoreCase("TRAPEZI")) {
            area = areaTrapezi();
        }
        else if (figura.equalsIgnoreCase("ROMBE")) {
            area = areaRombe();
        }
        else if (figura.equalsIgnoreCase("PARAL·LELOGRAM")) {
            area = areaParalelogram();
        }
        else if (figura.equalsIgnoreCase("CERCLE")) {
            area = areaCercle(scanner);
        }
        else {
            System.out.println("Figura no reconeguda. Si us plau, tria una opció vàlida.");
        }

        return area;
    }

    public static double areaTriangle() {
        double b = 23.0;
        double h = 8.0;
        return (b * h) / 2;
    }

    public static double areaQuadrat(){
        double r = 37.0;
        return Math.pow(r, 2);
    }

    public static double areaRectangle(){
        double a = 68.0;
        double b = 39.0;
        return a * b;
    }

    public static double areaTrapezi(){
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        return ((a*b)*h)/2;
    }

    public static double areaRombe() {
        double dM = 75.0;
        double dm = 30.0;
        return (dM * dm) / 2;
    }

    public static double areaParalelogram() {
        double b = 45.0;
        double h = 13.0;
        return b * h;
    }

    public static double areaCercle(Scanner scanner) {
        System.out.println("Quin es el radi del cercle?");
        double r = scanner.nextDouble();
        return Math.pow(r, 2) * Math.PI;
    }
}