package proyecto_transporte.src.transporte;

public class Barco extends Vehiculo implements ConMotor{

  //Escribo la implementacion del metodo abstracto de la clase vehiculo 
  public void describir(){
    System.err.println("Soy un barco que navega a "+ velocidadMaxima + " km/h.");
  }

  //Llamo al constructor de la clase vehiculo
  public Barco(int velocidadMaxima){
    super(velocidadMaxima = 50);
  }

  //Implemento la interfaz encenderMotor en la clase barco
  public void encenderMotor(){
    System.out.println("El motor del barco esta encendido");
  }


}
