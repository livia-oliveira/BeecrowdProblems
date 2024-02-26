package Iniciante.Quest_1009;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

   Scanner entrada = new Scanner(System.in);
   String nome = entrada.nextLine();
   double salario = entrada.nextDouble();
   double montante_vendas = entrada.nextDouble();
   double salario_bonus = (montante_vendas*0.15)+salario;

   System.out.println(String.format("TOTAL = R$ %.2f",salario_bonus));
  }
}
