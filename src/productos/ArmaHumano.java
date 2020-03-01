package productos;
//PRODUCTO CONCRETO
public class ArmaHumano implements Arma{
    @Override
    public String Estado() {
        return "Creando arma humano";
    }
    public static String Arma(){
        return "Espada bañada en plata de las tinieblas";
    }
   
    
}
