package Iniciante.Quest_1016;

import java.io.IOException;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

   Scanner entrada = new Scanner(System.in);

   int distancia = entrada.nextInt();

   int tempo = distancia * 2;

   System.out.println(tempo+" minutos");

  }


}
