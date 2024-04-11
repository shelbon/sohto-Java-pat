public enum BeverageSize {
  SMALL("petit"),
  MEDIUM("moyen"),
  LARGE("max");

  private String text;

  BeverageSize(final String text) {
    this.text = text;
  }

  public static BeverageSize fromString(String name) {
    for (BeverageSize type : BeverageSize.values()) {
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