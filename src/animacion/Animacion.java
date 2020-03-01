package animacion;
//CLASE DIRECTOR
public class Animacion {
    private PersonajeBuilder personajeBuilder;
    
    public void setPersonajeBuilder(PersonajeBuilder pb){
        personajeBuilder = pb;
    }
    
    public Personaje getPersonaje(){
        return personajeBuilder.getPersonaje();
    }
    
//    public void construirPizza() {
//        pizzaBuilder.crearNuevaPizza();
//        pizzaBuilder.buildMasa();
//        pizzaBuilder.buildSalsa();
//        pizzaBuilder.buildRelleno();
//    }
}
