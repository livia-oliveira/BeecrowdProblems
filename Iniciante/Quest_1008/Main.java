package Iniciante.Quest_1008;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);
    int numero_funcionario = entrada.nextInt();
    int horas_trabalhadas = entrada.nextInt();
    double valor_hora = entrada.nextDouble();
    double salario = horas_trabalhadas * valor_hora;

    System.out.println("NUMBER = "+numero_funcionario);
    System.out.println(String.format("SALARY = U$ %.2f",salario));


  }

}
