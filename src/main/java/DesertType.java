public enum DesertType {
  NORMAL("normal"),
  SPECIAL("special");

  private final String text;

  DesertType(final String text) {
    this.text = text;
  }

  public static DesertType fromString(String name) {
    for (DesertType type : DesertType.values()) {
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