package Iniciante.Quest_1010;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int codigoPeca1 = entrada.nextInt();
    int  numeroPecas1 = entrada.nextInt();
    double valorUnitarioPeca1 = entrada.nextDouble();

    int codigoPeca2 = entrada.nextInt();
    int  numeroPecas2 = entrada.nextInt();
    double valorUnitarioPeca2 = entrada.nextDouble();


    double valorPecas1 = numeroPecas1*valorUnitarioPeca1;
    double valorPecas2 = numeroPecas2*valorUnitarioPeca2;

    double total = valorPecas1+valorPecas2;

    System.out.println(String.format("VALOR A PAGAR: R$ %.2f",total));

  }
}
