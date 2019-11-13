package se.lolotron.robintwobeers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RobintwobeersApplication {

  @Autowired
  private BeerService beerService;

  @Autowired
  private ApplicationContext applicationContext;

  public static void main(String[] args) {
    SpringApplication.run(RobintwobeersApplication.class, args);
  }

  @RequestMapping("/test")
  public void callService() {
    beerService.twoBeersPlease();
  }

  @RequestMapping("/env")
  public Map<String, OtherService> listAllOtherServiceBeans() {
    return applicationContext.getBeansOfType(OtherService.class);
  }
}
