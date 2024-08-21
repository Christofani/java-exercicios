package com.betrybe.testWithSpring.controller;


import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, String> regioes() {
    return Map.of("estado", "Pernambuco", "cidade", "Recife");
  }
}
