package productos;
//PRODUCTO CONCRETO
public class ArmaduraEnano implements Armadura{
    @Override
    public String Descripcion() {
        return "Hecha por los mejores herreros del pueblo";
    }

    @Override
    public String Armadura() {
        return "/gui/partes_personajes/armadura_enano.png";
    }
}
