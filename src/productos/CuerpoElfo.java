package productos;
//PRODUCTO CONCRETO
public class CuerpoElfo implements Cuerpo{
    @Override
    public String Habilidad() {
        return "Comunicación con la naturaleza";
    }

    @Override
    public String Cuerpo() {
        return "/gui/partes_personajes/elfo.png";
    }
}
