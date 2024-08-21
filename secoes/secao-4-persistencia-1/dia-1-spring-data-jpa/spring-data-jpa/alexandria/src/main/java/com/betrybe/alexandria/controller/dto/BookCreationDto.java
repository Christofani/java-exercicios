package com.betrybe.alexandria.controller.dto;

// ... pacote e imports ...

import com.betrybe.alexandria.entity.Book;

public record BookCreationDto(String title, String genre) {

  public Book toEntity() {
    return new Book(title, genre);
  }

}
