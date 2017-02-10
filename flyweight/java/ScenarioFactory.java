public class ScenarioFactory {
  private static ScenarioComponent grass;
  private static ScenarioComponent cloud;
  private static ScenarioComponent sky;
  private static ScenarioComponent mountain;

  private ScenarioFactory() { }

  public static ScenarioComponent getGrassComponent() {
    if(grass == null) {
      grass = new Grass();
    }

    return grass;
  }

  public static ScenarioComponent getCloudComponent() {
    if(cloud == null) {
      cloud = new Cloud();
    }

    return cloud;
  }

  public static ScenarioComponent getSkyComponent() {
    if(sky == null) {
      sky = new Sky();
    }

    return sky;
  }

  public static ScenarioComponent getMountainComponent() {
    if(mountain == null) {
      mountain = new Mountain();
    }

    return mountain;
  }
}
