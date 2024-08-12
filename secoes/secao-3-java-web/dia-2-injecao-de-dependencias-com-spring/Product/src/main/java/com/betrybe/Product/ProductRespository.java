package com.betrybe.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRespository {
  public String getMessage() {
    return "Mensagem: produto retornado";
  }
}
