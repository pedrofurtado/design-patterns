public class LegacyRectangle {
  /**
   * Example of drawed rectangle:
   *
   *  (x1, y1) ->   ================== <- (x2, y2)
   *                =                =
   *                =                =
   *                =                =
   *                =                =
   *  (x3, y3) ->   ================== <- (x4, y4)
   */
  public void draw(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
    System.out.format("Rectangle drawn with borders: (%d, %d), (%d, %d), (%d, %d) and (%d, %d).%n", x1, y1, x2, y2, x3, y3, x4, y4);
  }
}
