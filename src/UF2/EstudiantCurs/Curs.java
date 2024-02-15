package UF2.EstudiantCurs;
public class Curs {
    public void mostrarInformacio(String nom, int credits) {
        System.out.println("Nom del curs: " + nom);
        System.out.println("Quantitat de crèdits: " + credits);
    }

    public int obtenirHores(int credits) {
        return credits * 15;
    }
}
