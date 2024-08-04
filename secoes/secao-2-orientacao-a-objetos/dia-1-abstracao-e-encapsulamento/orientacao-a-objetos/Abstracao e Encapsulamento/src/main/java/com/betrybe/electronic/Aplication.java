package com.betrybe.electronic;

public class Aplication {
  public  static  void main(String[] args) {
    System.out.println("Iniciando sistema...");

    Television television = new Television("Phillips", "LCD", 32);

    System.out.println("Modelo antigo:");
    System.out.println(television.getModel());
    television.setModel("LCD-Ultra");

    System.out.println("Modelo novo:");

    television.setSize(42);
    System.out.println(television.getSize());

    System.out.println(television.getModel());
    double sizeCm = Television.convertToCentimeters(32);
    System.out.println("O tamanho em cm é:" + sizeCm);

  }
}
