package productos;
//PRODUCTO CONCRETO
public class ArmaduraEnano implements Armadura{
    @Override
    public String Estado() {
        return "Creando armadura enano";
    }
    public static String Armadura(){
        return "Hecha por los mejores herreros del pueblo";
    }
}
