class Dish {
  DishType type;
  String name;
  Beverage beverage;
  Desert desert;
  boolean hasCoffee;
  
    public Dish(DishType type, String name, Beverage beverage, Desert desert, boolean hasCoffee) {
        this.type = type;
        this.name = name;
        this.beverage = beverage;
        this.desert = desert;
        this.hasCoffee = hasCoffee;
    }
  public static Dish fromArgs(String[] args) {
    // TODO guard *
    boolean hasCoffee = false;
    if (args[6] == "yes") {
        hasCoffee = true;
    }
    return new Dish(DishType.fromString(args[0]),
        args[1],
        new Beverage(args[2], BeverageSize.fromString(args[3])),
        new Desert(args[4], DesertType.fromString(args[5])),
        hasCoffee);
  }
}