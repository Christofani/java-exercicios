package com.betrybe.excecoes;

import java.util.Scanner;

public class Excecoes {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Digite um número de indice que você quer acessar :");
      int indice = scanner.nextInt();

      numeros[indice] = 10;

      numeros[indice] = 2/0;
      System.out.println(numeros);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Ops essa posição não existe !");
    } catch (ArithmeticException e) {
      System.out.println("Ops, não é possível dividir por 0! ");
    }
    scanner.close();
    System.out.println("Fim do programa !");
  }
}
