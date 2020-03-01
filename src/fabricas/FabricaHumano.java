package fabricas;
//FABRICA CONCRETA
import productos.ArmaHumano;
import productos.ArmaduraHumano;
import productos.CuerpoHumano;
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;

public class FabricaHumano implements FabricaPersonaje{
    @Override
    public Arma CrearArma(){
        return new ArmaHumano();
    }
    @Override
    public Armadura CrearArmadura(){
        return new ArmaduraHumano();
    }
    @Override
    public Cuerpo CrearCuerpo(){
        return new CuerpoHumano();
    }
}
