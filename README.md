# Demo
|Integrantes|Código|
|-----------|-----------|
|Juan Felipe Herrera Poveda|20181020077|
|Juan Esteban Olaya García|20171020135|
|Juan Diego León Moreno|20171020157|


Se implementan los patrones Builder y Abstract Factory

# Abstract Facory
  Se utiliza la interfaz FabricaPersonaje para definir los métodos que usarán las fábricas concretas de cada personaje.
  En el packpage productos se encuentran las clases que generan la presentación de cada personaje.
  La clase gui muestra una interfaz gráfica para seleccionar e instanciar a cada personaje.
  
 ![UML](https://github.com/Juandials/Demo/blob/master/ab.png)
  
  # Builder
  
    Patrón implementado para generar los personajes en el juego, se cuenta con la clase director Animacion, la clase producto Personaje,
    la clase AbstractBuilder PersonajeBuilder y las builder concretos de cada tipo de personaje
    
    La clase director define el personaje que se va a crear a través del método setPersonaje(), luego la clase builder concreto
    inicializa los atributos para finalmente instanciar el producto.
    
   ![UML](https://github.com/Juandials/Demo/blob/master/b.png)
    
    
    
