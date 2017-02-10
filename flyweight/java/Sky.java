public class Sky implements ScenarioComponent {
  private String color = "blue";
  private String period = "night";

  public void render(int x, int y) {
    System.out.format("Rendering of %s %s sky at coordinates (%d, %d) of screen.%n", color, period, x, y);
  }
}
