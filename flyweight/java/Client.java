public class Client {
  public static void main(String[] args) {
    ScenarioComponent grass = ScenarioFactory.getGrassComponent();

    grass.render(0, 0);
    grass.render(0, 1);
    grass.render(0, 2);
    grass.render(1, 1);
    grass.render(5, 5);
    grass.render(7, 8);

    ScenarioComponent sky = ScenarioFactory.getSkyComponent();

    sky.render(10, 10);

    ScenarioComponent cloud = ScenarioFactory.getCloudComponent();

    cloud.render(6, 8);
    cloud.render(6, 9);
    cloud.render(6, 10);

    ScenarioComponent mountain = ScenarioFactory.getMountainComponent();

    mountain.render(300, 500);

    System.out.println("Scenario renderized successfully.");
  }
}
