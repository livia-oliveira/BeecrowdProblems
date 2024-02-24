package Iniciante.Quest_1005;

import java.io.IOException;

import java.util.Scanner;


public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    double nota1, nota2, media;
    nota1 = entrada.nextDouble();
    nota2 = entrada.nextDouble();

    media = ((nota1 * 3.5)+(nota2 * 7.5))/11;

    System.out.println(String.format("MEDIA = %.5f", media));

  }

}