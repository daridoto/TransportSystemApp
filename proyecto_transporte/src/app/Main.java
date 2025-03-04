package proyecto_transporte.src.app;
import proyecto_transporte.src.transporte.*;


public class Main {

  //Creo esta clase para probar todas las clases de transporte
  public static void main(String[] args) {
    
    Coche cocheDario = new Coche(180);
    cocheDario.arrancar();
    cocheDario.encenderMotor();
    cocheDario.describir();
    cocheDario.setVelocidadMaxima(5);
    System.out.println(cocheDario.getVelocidadMaxima());

    Bicicleta bicicletaDario = new Bicicleta(30);
    bicicletaDario.arrancar();
    bicicletaDario.usarFuerzaHumana();
    bicicletaDario.describir();

    Barco barcoDario = new Barco(50);
    barcoDario.arrancar();
    barcoDario.encenderMotor();
    barcoDario.describir();

    Avion avionDario = new Avion(900);
    avionDario.arrancar();
    avionDario.encenderMotor();
    avionDario.describir();

  }


}
