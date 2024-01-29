package UF2.SNombreMesGran;

import java.util.Scanner;

public class SegonNMesGran {
    private static final Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        SegonNMesGran programa = new SegonNMesGran();
        programa.iniciarPrograma();
    }

    public void iniciarPrograma() {
        System.out.println("Benvingut al programa per trobar el segon nombre més gran.");
        int mida = demanarMidaVector();
        float[] vector = omplirVector(mida);
        mostrarResultat(calcularSegonMesGran(vector));
    }

    public int demanarMidaVector() {
        System.out.println("Quina mida vols per al vector?");
        return llegirEnter();
    }

    public float[] omplirVector(int mida) {
        float[] vector = new float[mida];
        System.out.println("Introdueix els nombres del vector:");

        for (int i = 0; i < mida; i++) {
            vector[i] = llegirFloat();
        }

        return vector;
    }

    public float calcularSegonMesGran(float[] arrayFloat) {
        float max1 = 0;
        float max2 = 0;

        for (int i = 0; i < arrayFloat.length; i++) {
            if (max1 < arrayFloat[i]) {
                max1 = arrayFloat[i];
            }
        }

        for (int i = 0; i < arrayFloat.length; i++) {
            if (arrayFloat[i] == max1) {
                // No hace nada si el elemento es igual al máximo
            } else if (max2 < arrayFloat[i]) {
                max2 = arrayFloat[i];
            }
        }

        return max2;
    }

    public void mostrarResultat(float resultat) {
        System.out.println("El segon nombre més gran és: " + resultat);
    }

    public int llegirEnter() {
        return lector.nextInt();
    }

    public float llegirFloat() {
        return lector.nextFloat();
    }
}
