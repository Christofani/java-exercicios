package com.betrybe.rpg;

public class Warrior extends PlayableCharacter {

  private String weapon;

  public String getWeapon() {
    return weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  @Override
  public void atack() {
    System.out.println("O guerreiro ataca com sua arma!");
    super.atack();
  }

  public void SpecialAttack() {
    if (!isAlive) {
      System.out.println("Personagem morreu e não pode usar seu ataque especial!");
      return;
    }
    System.out.println(this.getName() + "está usando seu ataque especial!");
  }
}
