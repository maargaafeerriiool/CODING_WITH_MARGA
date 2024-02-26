package UF4.Empresa;

public class Encarrec {
    private int dia;
    private int mes;
    private int hora;
    private int minuts;

    public Encarrec(int dia, int mes, int hora, int minuts) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.minuts = minuts;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }


    public void afegirProducte(Peticio p){}

    public void eliminarProducte(Peticio p){}
}
