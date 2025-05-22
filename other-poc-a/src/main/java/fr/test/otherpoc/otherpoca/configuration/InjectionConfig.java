package fr.test.otherpoc.otherpoca.configuration;

import fr.test.otherpoc.otherpocb.api.PocService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectionConfig {

  @Bean
  PocService pocService() {
    return new PocService();
  }

}
