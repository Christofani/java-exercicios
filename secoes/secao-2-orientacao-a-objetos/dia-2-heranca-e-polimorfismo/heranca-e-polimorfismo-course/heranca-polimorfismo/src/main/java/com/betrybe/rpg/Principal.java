package com.betrybe.rpg;

public class Principal {

  public static void main(String[] args) {
    Warrior warrior = new Warrior();
    Cleric cleric = new Cleric();
    Barbarian barbarian = new Barbarian();

    barbarian.move();
    cleric.heal();
    cleric.heal("Poção de vida !");
    cleric.heal("Feitiço de luz", 7);
    moveAndAtack(warrior);
    moveAndAtack(cleric);
  }

  public static void moveAndAtack(PlayableCharacter player) {
    player.move();
    player.atack();
  }
}
