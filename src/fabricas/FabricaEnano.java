package fabricas;
//FABRICA CONCRETA
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;
import productos.ArmaEnano;
import productos.ArmaduraEnano;
import productos.CuerpoEnano;

public class FabricaEnano implements FabricaPersonaje{
    @Override
    public Arma CrearArma(){
        return new ArmaEnano();
    }
    @Override
    public Armadura CrearArmadura(){
        return new ArmaduraEnano();
    }
    @Override
    public Cuerpo CrearCuerpo(){
        return new CuerpoEnano();
    }
}
