package productos;
//PRODUCTO CONCRETO
public class ArmaduraElfo implements Armadura{
    @Override
    public String Descripcion() {
        return "Armadura cómoda, 30% resistenccia";
    }

    @Override
    public String Armadura() {
        return "/gui/partes_personajes/armadura_elfo.png";
    }
}
