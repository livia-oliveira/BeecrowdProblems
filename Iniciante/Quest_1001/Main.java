package Iniciante.Quest_1001;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    int a = entrada.nextInt();
    int b = entrada.nextInt();
    int x = a + b;

    System.out.println("X = "+x);

  }

}