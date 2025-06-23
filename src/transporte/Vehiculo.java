package proyecto_transporte.src.transporte;


abstract class Vehiculo {
  //Creo el atrubuto velocidadMaxima 
  public int velocidadMaxima;

  //Escribo su respectivo constructor
  public Vehiculo(int velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
  }

  //Creo el metodo arrancar
  public void arrancar(){
    System.out.println("El vehiculo esta en marcha");
  }

  //Creo el metodo abstracto
  abstract void describir();

  //Creo los getter y setter necesarios
  public int getVelocidadMaxima(){
    return velocidadMaxima;
  }
  public void setVelocidadMaxima(int velocidadMaxima){
    this.velocidadMaxima = velocidadMaxima;
  }


}
