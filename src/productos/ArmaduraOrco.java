package productos;
//PRODUCTO CONCRETO
public class ArmaduraOrco implements Armadura{
    @Override
    public String Estado() {
        return "Creando armadura orco";
    }
    public static String Armadura(){
        return "Irrompible, 200% de resistencia";
    }
}
