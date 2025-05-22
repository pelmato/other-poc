package fr.test.otherpoc.otherpoca;

import fr.test.otherpoc.otherpocb.spi.ExternalServiceSpi;
import org.springframework.stereotype.Component;

@Component
public class ExternalServiceImpl implements ExternalServiceSpi {

  @Override
  public boolean isValid() {
    return true;
  }

}
