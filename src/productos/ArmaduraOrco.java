package productos;
//PRODUCTO CONCRETO
public class ArmaduraOrco implements Armadura{
    @Override
    public String Descripcion() {
        return "Irrompible, 200% de resistencia";
    }
    
    @Override
    public String Armadura() {
        return "/gui/partes_personajes/armadura_orco.png";
    }
}
