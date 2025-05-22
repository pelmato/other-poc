package fr.test.otherpoc.otherpoca.controller;

import fr.test.otherpoc.otherpocb.api.PocService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("poc")
public class PocController {

  private final PocService pocService;

  public PocController(PocService pocService) {
    this.pocService = pocService;
  }

  @GetMapping
  public ResponseEntity<String> get() {
    return ResponseEntity.ok(pocService.getValue());
  }

}
