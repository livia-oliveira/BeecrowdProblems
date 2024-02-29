package Iniciante.Quest_1015;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

   Scanner entrada = new Scanner(System.in);

   double x1 = entrada.nextDouble();
   double y1 = entrada.nextDouble();

   double x2 = entrada.nextDouble();
   double y2 = entrada.nextDouble();

   double subtracaox = (x2 - x1);
   double subtracaoy = (y2 - y1);
   double resultadoparcial = (subtracaox * subtracaox) + (subtracaoy * subtracaoy);
   double raiz = Math.sqrt(resultadoparcial);

   System.out.println(String.format("%.4f", raiz));


  }

}
