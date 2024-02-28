package Iniciante.Quest_1014;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int distanciaTotalPercorrida = entrada.nextInt();
    double totalCombustivelGasto = entrada.nextDouble();

    double consumoMedio = distanciaTotalPercorrida/totalCombustivelGasto;

    String consumoMedioFormatado = String.format("%.3f",consumoMedio," km/l");
    System.out.println(consumoMedioFormatado + " km/l");

  }
}
