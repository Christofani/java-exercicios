package com.betrybe.hour;

import java.time.LocalTime;

public class PontoEletronico {

  public void marcarHoraExtra() {
    LocalTime horaAtual = LocalTime.now();
    LocalTime fimExpediente = LocalTime.parse("17:00:00");

    if(horaAtual.isAfter(fimExpediente)) {
      System.out.println("Pessoa funcionária está fazendo hora extra !");
    } else {
      System.out.println("Pessoa funcionária está dentro do expediente de trabalho !");
    }
  }
}
