package fr.test.otherpoc.otherpocb.api;

import fr.test.otherpoc.otherpocb.aspect.PocAnnotation;

public class PocService {

  @PocAnnotation()
  public String getValue() {
    return "Hello POC";
  }

}
