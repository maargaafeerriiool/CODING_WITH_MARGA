package UF4.Empresa;

public class Main {
    public static void main(String[] args){
        Sucursal s = new Sucursal();
        Sucursal s1 = new Sucursal("Sucursal1", "68094801", "eere", "fefe");
        s.setNom("Sucursal Candela");
        System.out.println(s.getNom());
        Transportista t = new Transportista();
    }
}
