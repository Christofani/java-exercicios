package com.betrybe.tech;

public abstract class ComputerDevice {

  public static final double MAX_STORAGE_CAPACITY = 2048.0;
  private final String brand;
  private double storageCapacity;

  public ComputerDevice(String brand, double storageCapacity) {
    this.brand = brand;
    this.storageCapacity = storageCapacity;
  }

  public String getBrand() {
    return brand;
  }

  public double getStorageCapacity() {
    return storageCapacity;
  }

  public final void shutDown() {
    System.out.println("Desligando o dispositivo...");
  }

  public abstract void bootUp();
}
