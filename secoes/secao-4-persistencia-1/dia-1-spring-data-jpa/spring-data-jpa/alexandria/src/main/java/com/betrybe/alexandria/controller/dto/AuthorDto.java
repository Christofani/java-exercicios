package com.betrybe.alexandria.controller.dto;

// ... pacote e imports ...

import com.betrybe.alexandria.entity.Author;

public record AuthorDto(Long id, String name, String nationality) {

  public static AuthorDto fromEntity(Author author) {
    return new AuthorDto(
        author.getId(),
        author.getName(),
        author.getNationality()
    );
  }
}
