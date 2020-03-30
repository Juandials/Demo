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
  
    Patrón implementado para generar los personajes en el juego, se cuenta con la clase director Animacion, la clase producto Personaje y la clase AbstractBuilder PersonajeBuilder.
    La clase director define el personaje que se va a crear, luego la clase que implementa AbstractBuilder construirá el personaje
    
   ![UML](https://github.com/Juandials/Demo/blob/master/b.png)
    
    
    
