package fabricas;
//FABRICA ABSTRACTA
import productos.Arma;
import productos.Armadura;
import productos.Cuerpo;

public interface FabricaPersonaje {
    public Arma CrearArma();
    public Cuerpo CrearCuerpo();
    public Armadura CrearArmadura();
}
