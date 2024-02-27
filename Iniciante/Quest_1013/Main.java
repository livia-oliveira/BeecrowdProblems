package Iniciante.Quest_1013;

import java.io.IOException;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int A = entrada.nextInt();
    int B = entrada.nextInt();
    int C = entrada.nextInt();

    int MaiorAB = (A+B+ Math.abs(A-B))/2;

    if(MaiorAB < C){
      System.out.println(C+ " eh o maior");
    }else{
      System.out.println(MaiorAB+ " eh o maior");
    }

  }
}
