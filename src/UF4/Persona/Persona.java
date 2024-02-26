package UF4.Persona;

public class Persona {

    //Fitxer Persona.java
    String dni;
    String nom;
    short edat;

    // Retorna: 0 si s’ha pogut canviar el dni
    // 1 si el nou dni no és correcte − No s’efectua el canvi
    int setDni(String nouDni) {
        // Aquí hi podria haver una rutina de verificació del dni
        // i actuar en conseqüència. Com que no la incorporem, retornem sempre 0
        dni = nouDni;
        return 0;
    }

    void setNom(String nouNom) {
        nom = nouNom;
    }

    // Retorna: 0 si s’ha pogut canviar l’edat
    // 1 : Error per passar una edat negativa
    // 2 : Error per passar una edat "enorme"
    int setEdat(int novaEdat) {
        if (novaEdat < 0) return 1;
        if (novaEdat > Short.MAX_VALUE) return 2;
        edat = (short) novaEdat;
        return 0;
    }

    String getDni() {
        return dni;
    }

    String getNom() {
        return nom;
    }

    short getEdat() {
        return edat;
    }

    void visualitzar() {
        System.out.println("Dni...........:" + dni);
        System.out.println("Nom...........:" + nom);
        System.out.println("Edat..........:" + edat);
    }

    public static void main(String args[]) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.setDni("00000000");
        p1.setNom("Pepe Gotera");
        p1.setEdat(33);
        System.out.println("Visualització de persona p1:");
        p1.visualitzar();
        System.out.println("El dni de p1 és " + p1.getDni());
        System.out.println("El nom de p1 és " + p1.getNom());
        System.out.println("L’edat de p1 és " + p1.getEdat());
        System.out.println("Visualització de persona p2:");
        p2.visualitzar();
    }
}