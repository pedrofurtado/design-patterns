public class Cloud implements ScenarioComponent {
  private String color = "white";
  private int quantity = 5;

  public void render(int x, int y) {
    System.out.format("Rendering a set of %d %s clouds at coordinates (%d, %d) of screen.%n", quantity, color, x, y);
  }
}
