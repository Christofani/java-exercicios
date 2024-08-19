package com.betrybe.podcast_manager.controller;

import com.betrybe.podcast_manager.dto.PodcastCreationDto;
import com.betrybe.podcast_manager.dto.PodcastDto;
import com.betrybe.podcast_manager.model.Podcast;
import com.betrybe.podcast_manager.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcasts")
public class PodcastController {

  private PodcastService service;

  @Autowired
  public PodcastController(PodcastService service) {
    this.service = service;
  }

  @GetMapping
  public String getRoot() {
    return "Yay podcasts !";
  }

  @GetMapping("/{id}")
  public ResponseEntity<PodcastDto> getPodcast(@PathVariable Long id) {
    if (id > 1000) {
      return ResponseEntity.notFound().build();
    }
    Podcast podcast = service.findPodcastById(id);

    PodcastDto podcastDto = new PodcastDto(
        podcast.getId(), podcast.getName(), podcast.getUrl()
    );

    return ResponseEntity.ok(podcastDto);
  }

  @PostMapping
  public ResponseEntity<PodcastDto> newPodcast(@RequestBody PodcastCreationDto podcastCreationDto) {
    Podcast newPodcast = new Podcast();
    newPodcast.setName(podcastCreationDto.name());
    newPodcast.setUrl(podcastCreationDto.url());

    Podcast savedPodcast = service.savePodcast(newPodcast);

    PodcastDto podcastDto = new PodcastDto(
        savedPodcast.getId(),
        savedPodcast.getName(),
        savedPodcast.getUrl()
    );

    return ResponseEntity.status(HttpStatus.CREATED).body(podcastDto);
  }

  @GetMapping("/search")
  public String searchPodcast(@RequestParam String title) {
    return "Você buscou po Podcast com o título: %s".formatted(title);
  }
}

