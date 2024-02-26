package UF2.EstudiantCurs;
public class Curs {
    public void mostrarInformacio(String nom, int credits) {
        System.out.println("\nNom del curs: " + nom);
        System.out.println("Quantitat de crèdits: " + credits);
    }

    public int obtenirHores(int credits) {
        if (credits > 0) {
            return credits * 15;
        }
        else {
            System.out.println("Error: Quantitat de crèdits no vàlida. No es pot calcular les hores.");
            return 0;
        }
    }
}