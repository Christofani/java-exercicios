package com.betrybe.tech;

public class Application {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Samsung", 100, 14);
    PowerBank powerBank = new PowerBank();

    plugDevice(laptop);
    plugDevice(powerBank);
  }

//  public static void checkDevice(ComputerDevice device) {
//    System.out.println("Verificando dispositivo de marca " + device.getBrand());
//    device.bootUp();
//  }

  public static void plugDevice(Chargeable chargeable) {
    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
    chargeable.charge();
  }
}
