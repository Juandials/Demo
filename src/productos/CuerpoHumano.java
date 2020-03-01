package productos;
//PRODUCTO CONCRETO
public class CuerpoHumano implements Cuerpo{
    @Override
    public String Estado() {
        return "Creando cuerpo humano";
    }
    public static String Habilidad(){
        return "Ofensivo y débil";
    }
}
