package animacion;
//CONCRETE BUILDER
public class EnanoBuilder extends PersonajeBuilder{

    public EnanoBuilder() {
    }

    @Override
    public void arriba() {
        personaje.setArriba("/assets/Enano_arriba.png");
    }
    
    @Override
    public void abajo() {
        personaje.setAbajo("/assets/Enano_abajo.png");
    }

    @Override
    public void derecha() {
        personaje.setDerecha("/assets/Enano_derecha.png");
    }

    @Override
    public void izquierda() {
        personaje.setIzquierda("/assets/Enano_izquierda.png");
    }

    @Override
    public void atacaArriba() {
        personaje.setAtacaArriba("/assets/Enano_ataca_arriba.png");
    }

    @Override
    public void atacaAbajo() {
        personaje.setAtacaAbajo("/assets/Enano_ataca_abajo.png");
    }

    @Override
    public void atacaDerecha() {
        personaje.setAtacaDerecha("/assets/Enano_ataca_derecha.png");
    }

    @Override
    public void atacaIzquierda() {
        personaje.setAtacaIzquierda("/assets/Enano_ataca_izquierda.png");
    }
    
}
