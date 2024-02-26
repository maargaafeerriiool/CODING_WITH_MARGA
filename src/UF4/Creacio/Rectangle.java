package UF4.Creacio;

public class Rectangle {

    private int base;

    private int alcada;

    private String color;

    public Rectangle(){}

    public Rectangle(String col){
        color = col;
    }

    public Rectangle(int ba, int altura, String  col){
        color = col;
        base = ba;
        alcada = altura;
    }
    public Rectangle(int ba, int altura){
        base = ba;
        alcada = altura;
    }

}
