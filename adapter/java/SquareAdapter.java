public class SquareAdapter {
  private LegacyRectangle legacyRectangle = new LegacyRectangle();

  public void draw(int x1, int y1, int size) {
    int x2 = x1 + size;
    int y2 = y1;
    int x3 = x1;
    int y3 = y1 - size;
    int x4 = x1 + size;
    int y4 = y1 - size;

    legacyRectangle.draw(x1, y1, x2, y2, x3, y3, x4, y4);
  }
}
