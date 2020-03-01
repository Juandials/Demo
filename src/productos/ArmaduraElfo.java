package productos;
//PRODUCTO CONCRETO
public class ArmaduraElfo implements Armadura{
    @Override
    public String Estado() {
        return "Creando armadura elfo";
    }
    public static String Armadura(){
        return "Armadura cómoda, 30% resistenccia";
    }
}
