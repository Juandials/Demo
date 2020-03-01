package productos;
//PRODUCTO CONCRETO
public class ArmaOrco implements Arma{
    @Override
    public String Estado() {
        return "Creando arma orco";
    }
    public static String Arma(){
        return "Hacha forjada por los dioses nordicos";
    }
}
