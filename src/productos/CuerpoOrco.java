package productos;
//PRODUCTO CONCRETO
public class CuerpoOrco implements Cuerpo{
    @Override
    public String Habilidad() {
        return "Fuerza bruta";
    }

    @Override
    public String Cuerpo() {
        return "/gui/partes_personajes/orco.png";
    }
}
