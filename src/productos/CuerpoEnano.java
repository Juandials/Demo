package productos;
//PRODUCTO CONCRETO
public class CuerpoEnano implements Cuerpo{
    @Override
    public String Habilidad() {
        return "Inteligente y estratega";
    }

    @Override
    public String Cuerpo() {
        return "/gui/partes_personajes/enano.png";
    }
}
