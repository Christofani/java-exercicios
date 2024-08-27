package com.betrybe;

import com.betrybe.date.AlertaAniversario;
import com.betrybe.duration.IdadeEmDias;
import com.betrybe.hour.PontoEletronico;

public class Main {

  public static void main(String[] args) {
    AlertaAniversario alerta = new AlertaAniversario();
    alerta.checarAniversario();

    PontoEletronico ponto = new PontoEletronico();
    ponto.marcarHoraExtra();

    IdadeEmDias idade = new IdadeEmDias();
    System.out.println("A quantidade de dias desde o seu nascimento é:"
        + idade.calcularIdadeEmDias("1998-05-26T23:33:00"));
  }
}