class Desert {
  private String name;
  private DesertType type;

  public Desert(String name, DesertType type) {
    this.name = name;
    this.type = type;
  }

  public String name() {
    return name;
  }

  public DesertType type() {
    return type;
  }

}