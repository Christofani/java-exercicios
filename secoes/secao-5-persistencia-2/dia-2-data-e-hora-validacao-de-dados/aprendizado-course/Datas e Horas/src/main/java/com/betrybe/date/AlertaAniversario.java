package com.betrybe.date;

import java.time.LocalDate;

public class AlertaAniversario {


  public  void checarAniversario() {
    LocalDate datahoje = LocalDate.now();
    LocalDate nascimeto = LocalDate.parse("1998-05-26");


    if(datahoje.getMonth() == nascimeto.getMonth()) {
      if(datahoje.getDayOfMonth() == nascimeto.getDayOfMonth()) {
        System.out.println("Hoje é seu aniversário ! ");
      }
       else  if (datahoje.getDayOfMonth() < nascimeto.getDayOfMonth()) {
         System.out.println("Seu aniversário está próximo !");
      } else {
         System.out.println("Seu aniversário já passou !");
      }
    } else {
      System.out.println("Não é seu aniversário !");
    }
  }
}
