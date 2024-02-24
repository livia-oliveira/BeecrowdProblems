package Iniciante.Quest_1006;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    double nota1, nota2, nota3, media;

    nota1 = entrada.nextDouble();
    nota2 = entrada.nextDouble();
    nota3 = entrada.nextDouble();

    media = ((nota1 * 2)+(nota2 * 3)+(nota3 * 5))/10;

    System.out.println(String.format("MEDIA = %.1f", media));

  }

}