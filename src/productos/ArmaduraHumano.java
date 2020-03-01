package productos;
//PRODUCTO CONCRETO
public class ArmaduraHumano implements Armadura{
    @Override
    public String Estado() {
        return "Creando armadura humano";
    }
     public static String Armadura(){
        return "Armadura de Asgard";
    }
}
