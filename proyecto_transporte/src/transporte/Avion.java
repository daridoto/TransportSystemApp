package proyecto_transporte.src.transporte;

public final class Avion extends Vehiculo implements ConMotor{

  //Escribo la implementacion del metodo abstracto de la clase vehiculo 
  public void describir(){
    System.out.println("Soy un avion que vuela a "+ velocidadMaxima + " km/h.");
  }

  //Llamo al constructor de la clase vehiculo
  public Avion(int velocidadMaxima){
    super(velocidadMaxima = 900);
  }

  //Implemento la interfaz encender motor en la clase avion 
  public void encenderMotor(){
    System.out.println("El motor del avion esta encendido");
  }
}
