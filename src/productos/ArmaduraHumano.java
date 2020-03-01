package productos;
//PRODUCTO CONCRETO
public class ArmaduraHumano implements Armadura{
    @Override
    public String Descripcion() {
        return "Armadura de Asgard";
    }

    @Override
    public String Armadura() {
        return "/gui/partes_personajes/armadura_humano.png";
    }
}
