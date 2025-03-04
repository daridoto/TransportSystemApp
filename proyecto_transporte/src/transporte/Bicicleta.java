package proyecto_transporte.src.transporte;

public class Bicicleta extends Vehiculo implements SinMotor {

  //Escribo la implementacion del metodo abstracto de la clase vehiculo 
  public void describir(){
    System.out.println("Soy una bicicleta con una velocidad maxima de "+ velocidadMaxima + " km/h.");
  }

  //Llamo al constructor de la clase vehiculo
  public Bicicleta(int velocidadMaxima){
    super(velocidadMaxima = 30);
  }

  //Implemento el metodo de la interfaz ConMotor
  public void usarFuerzaHumana(){
    System.out.println("Usando fuerza humana para mover la bicicleta");
  }
}
