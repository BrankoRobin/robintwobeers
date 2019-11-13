package se.lolotron.robintwobeers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeerService {

  @Bean("thisIsTheOnlyInstanceOfTheService")
  public OtherService twoBeersPlease() {
    return new OtherService();
  }
}
