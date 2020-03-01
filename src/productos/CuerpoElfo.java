package productos;
//PRODUCTO CONCRETO
public class CuerpoElfo implements Cuerpo{
    @Override
    public String Estado() {
        return "Creando cuerpo elfo";
    }
    public static String Habilidad(){
        return "Comunicación con la naturaleza";
    }
}
