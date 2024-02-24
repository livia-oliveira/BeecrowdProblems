package Iniciante.Quest_1002;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner entrada = new Scanner(System.in);

    double r, a;

    r = entrada.nextDouble();

    a = (3.14159* (r*r));

    System.out.println(String.format("A=%.4f", a));
  }

}