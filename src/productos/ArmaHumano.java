package productos;
//PRODUCTO CONCRETO
public class ArmaHumano implements Arma{
    @Override
    public String Caracteristicas() {
        return "Espada bañada en plata de las tinieblas";
    }

    @Override
    public String Arma() {
        return "/gui/partes_personajes/arma_humano.png";
    }
}
