package animacion;
//CONCRETE BUILDER
public class ElfoBuilder extends PersonajeBuilder {

    public ElfoBuilder() {
    }

    @Override
    public void arriba() {
        personaje.setArriba("/assets/Elfo_arriba.png");
    }

    @Override
    public void abajo() {
        personaje.setAbajo("/assets/Elfo_abajo.png");
    }

    @Override
    public void derecha() {
        personaje.setDerecha("/assets/Elfo_derecha.png");
    }

    @Override
    public void izquierda() {
        personaje.setIzquierda("/assets/Elfo_izquierda.png");
    }

    @Override
    public void atacaArriba() {
        personaje.setAtacaArriba("/assets/Elfo_ataca_arriba.png");
    }

    @Override
    public void atacaAbajo() {
        personaje.setAtacaAbajo("/assets/Elfo_ataca_abajo.png");
    }

    @Override
    public void atacaDerecha() {
        personaje.setAtacaDerecha("/assets/Elfo_ataca_derecha.png");
    }

    @Override
    public void atacaIzquierda() {
        personaje.setAtacaIzquierda("/assets/Elfo_ataca_izquierda.png");
    }
    
}
