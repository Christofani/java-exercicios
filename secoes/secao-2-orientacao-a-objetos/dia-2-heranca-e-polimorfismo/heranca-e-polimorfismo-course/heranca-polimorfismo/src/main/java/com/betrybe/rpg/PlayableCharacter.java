package com.betrybe.rpg;

public class PlayableCharacter {

  private String name;
  private String race;

  protected boolean isAlive;

  public PlayableCharacter() {
    this.isAlive = true;
  }

  public void move() {
    System.out.println("O personagem está se movendo.");
  }

  public void atack() {
    System.out.println("O personagem está atacando.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }
}
