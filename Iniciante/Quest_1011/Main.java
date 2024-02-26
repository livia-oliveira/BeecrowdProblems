package Iniciante.Quest_1011;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    double raio = entrada.nextDouble();
    double volume = (4.0/3)*(raio*raio*raio)*3.14159;

    System.out.println(String.format("VOLUME = %.3f" ,volume));


  }
}
