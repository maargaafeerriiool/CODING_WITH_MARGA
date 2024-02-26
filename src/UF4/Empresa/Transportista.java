package UF4.Empresa;

public class Transportista {
    private String nom;
    private String telefon;

    private int numLlicencia;

    public Transportista (){

    }

    public Transportista (int numLlicenciaTransportista){
        numLlicencia = numLlicenciaTransportista;
    }

    public Transportista (String nomTransportista, String telefonTransportista){
        nom = nomTransportista;
        telefon = telefonTransportista;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getNumLlicencia() {
        return numLlicencia;
    }

    public void setNumLlicencia(int numLlicencia) {
        this.numLlicencia = numLlicencia;
    }

    public void assignarEncarrec(Encarrec e){}

    public void anularEncarrec(Encarrec e){}
}
