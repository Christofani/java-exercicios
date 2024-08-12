package com.betrybe.tech;

public class Application {

  public static void main(String[] args) {
    ComputerDevice gerenericDevice = new Laptop("Apple", 256.0, 13.3);

    if (gerenericDevice instanceof Laptop) {
      Laptop specificLaptop = (Laptop) gerenericDevice;
    }
  }
}
