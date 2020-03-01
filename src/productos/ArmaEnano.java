package productos;
//PRODUCTO CONCRETO
public class ArmaEnano implements Arma{
    @Override
    public String Estado() {
        return "Creando arma enano";
    }
    public static String Arma(){
        return "Elaborada con madera del árbol de la vida";
    }
}
