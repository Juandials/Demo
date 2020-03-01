package animacion;
//CONCRETE BUILDER
public class OrcoBuilder extends PersonajeBuilder{

    public OrcoBuilder() {
    }

    @Override
    public void arriba() {
        personaje.setArriba("/assets/Orco_arriba.png");
    }

    @Override
    public void abajo() {
        personaje.setAbajo("/assets/Orco_abajo.png");
    }

    @Override
    public void derecha() {
        personaje.setDerecha("/assets/Orco_derecha.png");
    }

    @Override
    public void izquierda() {
        personaje.setIzquierda("/assets/Orco_izquierda.png");
    }

    @Override
    public void atacaArriba() {
        personaje.setAtacaArriba("/assets/Orco_ataca_arriba.png");
    }

    @Override
    public void atacaAbajo() {
        personaje.setAtacaAbajo("/assets/Orco_ataca_abajo.png");
    }

    @Override
    public void atacaDerecha() {
        personaje.setAtacaDerecha("/assets/Orco_ataca_derecha.png");
    }

    @Override
    public void atacaIzquierda() {
        personaje.setAtacaIzquierda("/assets/Orco_ataca_izquierda.png");
    }
    
}
