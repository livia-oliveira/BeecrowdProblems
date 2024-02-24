package Iniciante.Quest_1004;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int numero1, numero2, prod;

    numero1 = entrada.nextInt();
    numero2 = entrada.nextInt();

    prod = numero1*numero2;

    System.out.println("PROD = "+prod);

  }

}