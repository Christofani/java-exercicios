package com.betrybe.Product.service;

import com.betrybe.Product.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private ProductRespository productRespository;

  @Autowired
  public ProductService(ProductRespository productRespository) {
    this.productRespository = productRespository;
  }

  public String getMessage() {
    return productRespository.getMessage();
  }
}
