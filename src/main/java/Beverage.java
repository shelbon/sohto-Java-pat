class Beverage {
  private String name;
  private BeverageSize size;

  public Beverage(String name, BeverageSize size) {
    this.name = name;
    this.size = size;
  }

  public String name() {
    return name;
  }

  public BeverageSize size() {
    return size;
  }
}