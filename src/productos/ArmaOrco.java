package productos;
//PRODUCTO CONCRETO
public class ArmaOrco implements Arma{
    @Override
    public String Caracteristicas() {
        return "Hacha forjada por los dioses nordicos";
    }

    @Override
    public String Arma() {
        return "/gui/partes_personajes/arma_orco.png";
    }
}
