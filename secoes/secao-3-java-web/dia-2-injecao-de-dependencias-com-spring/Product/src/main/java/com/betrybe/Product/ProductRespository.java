package com.betrybe.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRespository {

  private Database database;

  @Autowired
  public ProductRespository(Database database) {
    this.database = database;
  }

  public String getMessage() {
    return "Mensagem: produto retornado";
  }
}
