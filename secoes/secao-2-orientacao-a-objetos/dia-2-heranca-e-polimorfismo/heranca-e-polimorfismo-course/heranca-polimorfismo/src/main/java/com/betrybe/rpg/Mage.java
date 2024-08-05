package com.betrybe.rpg;

public class Mage extends PlayableCharacter {

  @Override
  public void atack() {
    System.out.println("O mago lança um feitiço");
  }

  private String spall;

  public String getSpall() {
    return spall;
  }

  public void setSpall(String spall) {
    this.spall = spall;
  }
}
