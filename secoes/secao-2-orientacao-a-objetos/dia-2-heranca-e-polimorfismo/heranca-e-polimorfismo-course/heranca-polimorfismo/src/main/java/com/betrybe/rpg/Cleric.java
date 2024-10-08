package com.betrybe.rpg;

public class Cleric extends PlayableCharacter {

  private String magic;

  public String getMagic() {
    return magic;
  }

  public void setMagic(String magic) {
    this.magic = magic;
  }

  public void heal() {
    System.out.println("o clérico está curando com uma habilidade básica !");
  }

  public void heal(String potion) {
    System.out.println("O clérico está curando com a poção " + potion + ".");
  }

  public void heal(String spell, int power) {
    System.out.println(
        "O clérico está usando feitiço " + spell + " com um poder de " + power + ".");
  }
}
