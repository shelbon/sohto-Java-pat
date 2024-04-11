public enum DishType {
  PLAT("assiette"),
  SANDWICH("sandwich");
  
  private final String text;
  DishType(final String text) {
      this.text = text;
  }
  public static DishType fromString(String name) {
    for (DishType type : DishType.values()) {
      if (type.toString().equalsIgnoreCase(name)) {
        return type;
      }
    }
    
    throw new IllegalArgumentException("Invalid Dish Type: " + name);
  }
  @Override
  public String toString() {
      return text;
  }

}