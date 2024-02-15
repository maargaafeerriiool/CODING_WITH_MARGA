package UF2.CalcularArees;

import java.util.Scanner;

public class CalculAreesMod {
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
        Triangle calcularTriangle = new Triangle();
        Quadrat calcularQuadrat = new Quadrat();
        Rectangle calcularRectangle = new Rectangle();
        Trapezi calcularTrapezi = new Trapezi();
        Rombe calcularRombe = new Rombe();
        Parallelogram calcularParallelogram = new Parallelogram();
        Cercle calcularCercle = new Cercle();

        if (figura.equalsIgnoreCase("TRIANGLE")) {
            area = calcularTriangle.areaTriangle();
        }
        else if (figura.equalsIgnoreCase("QUADRAT")) {
            area = calcularQuadrat.areaQuadrat();
        }
        else if (figura.equalsIgnoreCase("RECTANGLE")) {
            area = calcularRectangle.areaRectangle();
        }
        else if (figura.equalsIgnoreCase("TRAPEZI")) {
            area = calcularTrapezi.areaTrapezi();
        }
        else if (figura.equalsIgnoreCase("ROMBE")) {
            area = calcularRombe.areaRombe();
        }
        else if (figura.equalsIgnoreCase("PARALLELOGRAM")) {
            area = calcularParallelogram.areaParallelogram();
        }
        else if (figura.equalsIgnoreCase("CERCLE")) {
            area = calcularCercle.areaCercle(scanner);
        }
        else {
            System.out.println("Figura no reconeguda. Si us plau, tria una opció vàlida.");
        }

        return area;
    }
}
