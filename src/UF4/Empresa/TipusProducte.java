package UF4.Empresa;

import org.w3c.dom.ls.LSOutput;

public class TipusProducte {
    private String nom;
    private int codiIdentificador;
    private double preu;
    private int estoc;
    private boolean aLaVenda;

    public String getNom() {
        return nom;
    }

    public TipusProducte(String nom, int codiIdentificador, double preu, int estoc, boolean aLaVenda) {
        this.nom = nom;
        this.codiIdentificador = codiIdentificador;
        this.preu = preu;
        this.estoc = estoc;
        this.aLaVenda = aLaVenda;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodiIdentificador() {
        return codiIdentificador;
    }

    public void setCodiIdentificador(int codiIdentificador) {
        this.codiIdentificador = codiIdentificador;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }


    public boolean isaLaVenda() {
        return aLaVenda;
    }

    public void setaLaVenda(boolean aLaVenda) {
        this.aLaVenda = aLaVenda;
    }
}