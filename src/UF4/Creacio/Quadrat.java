package UF4.Creacio;

public class Quadrat {

    private int costat;

    private String color;

    public Quadrat(){}

    public Quadrat(int cos){
        costat = cos;
    }

    public Quadrat(int cos, String col){
        color = col;
        costat = cos;
    }

    //public int getCostat(){ return costat;}

    //public int setCostat(int costat){ this.costat = costat;}

    public String getColor(){return color;}

    public void setColor(String color){this.color = color;}

}
