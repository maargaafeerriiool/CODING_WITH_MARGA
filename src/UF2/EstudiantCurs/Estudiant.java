package UF2.EstudiantCurs;
public class Estudiant {
        public void mostrarInformacio(String nom, int edat) {
            System.out.println("Nom de l'estudiant: " + nom);
            System.out.println("Edat de l'estudiant: " + edat);
        }
        public boolean esMajorEdat(int edat) {
            return edat >= 18;
        }
        public void saludar(String nom) {
            System.out.println("Hola, " + nom + "!");
        }
}
