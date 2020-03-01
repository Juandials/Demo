package animacion;
//ABSTRACT BUILDER
public abstract class PersonajeBuilder {
    protected Personaje personaje;
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public void crearNuevoPersonaje(){
        personaje = new Personaje();
    }
    
    public abstract void arriba();
//    public abstract void buildMasa();
//
//    public abstract void buildSalsa();
//
//    public abstract void buildRelleno();
}
