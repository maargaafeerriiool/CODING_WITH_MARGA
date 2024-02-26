package UF4.Creacio;

public class Main {
    public static void main(String[]args){
        Rectangle r0 = new Rectangle();
        Rectangle r1 = new Rectangle("blau");
        Rectangle r2 = new Rectangle(5,3,"verd");

        Quadrat q0 = new Quadrat();
        Quadrat q1 = new Quadrat(3,"vermell");
        Quadrat q2 = new Quadrat(3);

        Triangle t0 = new Triangle();
        Triangle t1 = new Triangle(4,4,3,"verd");

        Cercle c0 = new Cercle();
        Cercle c1 = new Cercle(2.5,"blau");
        //Cercle c2 = new Cercle("blau");

        q2.setColor("groc");
        //System.out.println(c2.getColor());

    }
}
