package fr.test.otherpoc.otherpoca.configuration;

import fr.test.otherpoc.otherpocb.aspect.PocAspect;
import fr.test.otherpoc.otherpocb.spi.ExternalServiceSpi;
import jakarta.annotation.PostConstruct;
import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectConfiguration {

  private final ExternalServiceSpi externalService;

  public AspectConfiguration(ExternalServiceSpi externalService) {
    this.externalService = externalService;
  }

  @PostConstruct
  void configureAspect() {
    PocAspect pocAspect = Aspects.aspectOf(PocAspect.class);
    pocAspect.setExternalService(externalService);
  }
  
}
