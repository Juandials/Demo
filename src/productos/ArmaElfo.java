package productos;
//PRODUCTO CONCRETO
public class ArmaElfo implements Arma{

    @Override
    public String Estado() {
        return "Creando arma elfo";
    }
    public static String Arma(){
        return "Espada reforzada con babas de dragón";
    }
    
}
