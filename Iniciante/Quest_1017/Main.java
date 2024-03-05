package Iniciante.Quest_1017;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int tempoGasto = entrada.nextInt();
    int velocidadeMedia = entrada.nextInt();

    int distancia = velocidadeMedia*tempoGasto;

    double quant_litros = distancia/12.0;

    System.out.println(String.format("%.3f", quant_litros));

  }

}
