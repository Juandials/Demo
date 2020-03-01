package animacion;
//CLASE PRODUCTO
public class Personaje {
    private String arriba = "";
    private String abajo = "";
    private String izquierda = "";
    private String derecha = "";
    private String atacaArriba = "";
    private String atacaAbajo = "";
    private String atacaDerecha = "";
    private String atacaIzquierda = "";

    public Personaje() {
    }
        
    public String getAtacaArriba() {
        return atacaArriba;
    }

    public void setAtacaArriba(String atacaArriba) {
        this.atacaArriba = atacaArriba;
    }

    public String getAtacaAbajo() {
        return atacaAbajo;
    }

    public void setAtacaAbajo(String atacaAbajo) {
        this.atacaAbajo = atacaAbajo;
    }

    public String getAtacaDerecha() {
        return atacaDerecha;
    }

    public void setAtacaDerecha(String atacaDerecha) {
        this.atacaDerecha = atacaDerecha;
    }

    public String getAtacaIzquierda() {
        return atacaIzquierda;
    }

    public void setAtacaIzquierda(String atacaIzquierda) {
        this.atacaIzquierda = atacaIzquierda;
    }
    
    public String getArriba() {
        return arriba;
    }

    public void setArriba(String arriba) {
        this.arriba = arriba;
    }

    public String getAbajo() {
        return abajo;
    }

    public void setAbajo(String abajo) {
        this.abajo = abajo;
    }

    public String getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(String izquierda) {
        this.izquierda = izquierda;
    }

    public String getDerecha() {
        return derecha;
    }

    public void setDerecha(String derecha) {
        this.derecha = derecha;
    }
}
