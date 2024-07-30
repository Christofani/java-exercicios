package com.betrybe.electronic;

public class Aplication {
  public  static  void main(String[] args) {
    System.out.println("Iniciando sistema...");

    Television television = new Television("Phillips", "LCD", 32);
    television.turnOn();
    television.turnOff();

    System.out.println(television.info());
  }
}
