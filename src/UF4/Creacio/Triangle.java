package UF4.Creacio;

public class Triangle {
    private int costat1;

    private int costat2;

    private int costat3;

    private String color;

    public Triangle(){}

    public Triangle(int cos1, int cos2, int cos3){
        costat1= cos1;
        costat2= cos2;
        costat3= cos3;
    }
    public Triangle(int cos1, int cos2, int cos3, String col){
        color = col;
        costat1= cos1;
        costat2= cos2;
        costat3= cos3;
    }

}
