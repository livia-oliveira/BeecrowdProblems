package Iniciante.Quest_1012;

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

  Scanner entrada = new Scanner(System.in);

  double A = entrada.nextDouble();
  double B = entrada.nextDouble();
  double C = entrada.nextDouble();

  double areaTriangulo = (A * C)/2;
  double areaCirculo = 3.14159*(C*C);
  double areaTrapezio = ((A+B)*C)/2;
  double areaQuadrado = B*B;
  double areaRetangulo = A*B;

  System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
  System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
  System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
  System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
  System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));



  }
}
