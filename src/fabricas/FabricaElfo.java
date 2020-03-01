package fabricas;
//FABRICA CONCRETA
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;
import productos.ArmaElfo;
import productos.ArmaduraElfo;
import productos.CuerpoElfo;

public class FabricaElfo implements FabricaPersonaje{
    @Override
    public Arma CrearArma(){
        return new ArmaElfo();
    }
    @Override
    public Armadura CrearArmadura(){
        return new ArmaduraElfo();
    }
    @Override
    public Cuerpo CrearCuerpo(){
        return new CuerpoElfo();
    }
}
