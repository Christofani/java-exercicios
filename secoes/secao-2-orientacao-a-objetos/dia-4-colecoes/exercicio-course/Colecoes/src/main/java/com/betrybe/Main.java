package com.betrybe;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);
    System.out.println(numeros);
    Collections.sort(numeros);
    System.out.println(numeros);

    List<String> estudantes = Arrays.asList("João", "Maria", "Pedro", "Jose");
    estudantes.set(0,"Joana");
    System.out.println(estudantes);
  }
}