package productos;
//PRODUCTO CONCRETO
public class CuerpoOrco implements Cuerpo{
    @Override
    public String Estado() {
        return "Creando cuerpo orco";
    }
    public static String Habilidad(){
        return "Fuerza bruta";
    }
}
