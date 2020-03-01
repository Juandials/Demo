package productos;
//PRODUCTO CONCRETO
public class ArmaElfo implements Arma{

    @Override
    public String Caracteristicas() {
        return "Espada reforzada con babas de dragón";
    }

    @Override
    public String Arma() {
        return "/gui/partes_personajes/arma_elfo.png";
    }
}
