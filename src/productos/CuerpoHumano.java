package productos;
//PRODUCTO CONCRETO
public class CuerpoHumano implements Cuerpo{
    @Override
    public String Habilidad() {
        return "Ofensivo y débil";
    }

    @Override
    public String Cuerpo() {
        return "/gui/partes_personajes/humano.png";
    }
}
