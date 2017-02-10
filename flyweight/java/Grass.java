public class Grass implements ScenarioComponent {
  private String color = "green";

  public void render(int x, int y) {
    System.out.format("Rendering of %s grass at coordinates (%d, %d) of screen.%n", color, x, y);
  }
}
