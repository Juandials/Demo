package productos;
//PRODUCTO CONCRETO
public class ArmaEnano implements Arma{
    @Override
    public String Caracteristicas(){
        return "Elaborada con madera del árbol de la vida";
    }

    @Override
    public String Arma() {
        return "/gui/partes_personajes/arma_enano.png";
    }
}
