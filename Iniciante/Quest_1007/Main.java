package Iniciante.Quest_1007;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int n1 = entrada.nextInt();
    int n2 = entrada.nextInt();
    int n3 = entrada.nextInt();
    int n4 = entrada.nextInt();
    int diferenca = (n1*n2-n3*n4);

    System.out.println("DIFERENCA = "+diferenca);


  }
}
