package com.generation;
import java.util.Scanner;// se importa libreria para usar scaner

public class Codigo4 {
public static void main(String[] args) { // se agrega método main
	
	Scanner s = new Scanner(System.in);// se agrega dentro del parentesis System.in
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    Scanner s2 = new Scanner(System.in); // se agrega sys.in
    String j2 = s2.nextLine(); // se renombra la llamada del scanner
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijera") { // cambie a singular ya que piedra y papel lo estan
            g = 1;
          }// if piedra

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }// if papel
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default: // defalut g == 2
      }
      System.out.println("Gana el jugador " + g);
    }// switch
  
  

	
}// main
}//class
    