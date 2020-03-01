package fabricas;
//FABRICA CONCRETA
import productos.ArmaOrco;
import productos.ArmaduraOrco;
import productos.CuerpoOrco;
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;

public class FabricaOrco implements FabricaPersonaje{

    @Override
    public Arma CrearArma() {
        return new ArmaOrco();
    }

    @Override
    public Cuerpo CrearCuerpo() {
        return new CuerpoOrco();
    }

    @Override
    public Armadura CrearArmadura() {
        return new ArmaduraOrco();
    }
    
}
