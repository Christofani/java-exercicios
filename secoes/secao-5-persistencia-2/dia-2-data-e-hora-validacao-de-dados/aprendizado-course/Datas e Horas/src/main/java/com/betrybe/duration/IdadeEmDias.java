package com.betrybe.duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class IdadeEmDias {


  public long calcularIdadeEmDias(String nascimento) {
    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaNascimento = LocalDateTime.parse(nascimento);

    Duration duration = Duration.between(diaNascimento, hoje);
    long quantidadeDias = duration.toDays();

    return quantidadeDias;
  }
}
