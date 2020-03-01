package productos;
//PRODUCTO CONCRETO
public class CuerpoEnano implements Cuerpo{
    @Override
    public String Estado() {
        return "Creando cuerpo enano";
    }
    public static String Habilidad(){
        return "Inteligente y estratega";
    }
}
