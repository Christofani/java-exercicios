package com.betrybe.docker_spring.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping
  public Map<String, String> mensagem() {
    Map<String, String> newMap = new HashMap<>();
    newMap.put("Mensagem", "Boas vindas");
    return newMap;
  }
}
