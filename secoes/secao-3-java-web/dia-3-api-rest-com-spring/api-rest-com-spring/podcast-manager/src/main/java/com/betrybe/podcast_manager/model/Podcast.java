package com.betrybe.podcast_manager.model;

public class Podcast {

  private String secretToken;
  private Long id;
  private String name;
  private String url;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getSecretToken() {
    return secretToken;
  }

  public void setSecretToken(String secretToken) {
    this.secretToken = secretToken;
  }
}
