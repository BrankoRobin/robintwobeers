package se.lolotron.robintwobeers;

public class OtherService {

  private static int counter = 0;

  private final String name;

  public OtherService() {
    this.name = "instance" + (++counter);
  }

  public String getName() {
    return name;
  }
}
