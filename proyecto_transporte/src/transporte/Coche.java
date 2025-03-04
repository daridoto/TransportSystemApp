package proyecto_transporte.src.transporte;

public class Coche extends Vehiculo implements ConMotor{

  //Escribo la implementacion del metodo abstracto de la clase vehiculo 
  public void describir(){
    System.out.println("Soy un coche que puede alcanzar "+ velocidadMaxima + " km/h.");
  }

  //Llamo al constructor de la clase vehiculo
  public Coche(int velocidadMaxima){
    super(velocidadMaxima);
  }

  //Implemento el metodo de la interfaz ConMotor
  public void encenderMotor(){
    System.out.println("El motor del coche esta encendido");
  }


}
