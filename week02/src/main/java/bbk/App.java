package bbk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
@Component
@ComponentScan("bbk")
@SpringBootApplication
public class App implements CommandLineRunner {
  private static final String EXIT = "exit";
  private static final String POLL = "poll";
  private List<Sensor> sensors;

  @Autowired
  ControlUnit controlUnit;

  @Autowired
  SensorConfigurationProperties sensorConfigurationProperties;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);

  }

  @Override
  public void run(String... strings) throws Exception {
    System.out.println(sensorConfigurationProperties.getFire());
    controlUnit.setSensors(setUpSensors());
    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals(EXIT)) {
      System.out.println("Type \"poll\" to poll all sensors once or \"exit\" to exit");
      input = scanner.nextLine();
      if (input.equals(POLL)) {
        controlUnit.pollSensors();
      }
    }
  }

  private List<Sensor> setUpSensors(){
    sensors = new ArrayList<>();
    sensors.add(new FireSensor("Lobby 1st floor","Fire sensor"));
    sensors.add(new SmokeSensor("Lobby 9st floor","Smoke sensor"));
    sensors.add(new FireSensor("Lobby 5st floor","Fire sensor"));
    sensors.add(new SmokeSensor("Lobby 2st floor","Smoke sensor"));
    sensors.add(new FireSensor("Lobby 3st floor","Fire sensor"));
    sensors.add(new SmokeSensor("Lobby 8st floor","Smoke sensor"));

    return sensors;
  }
}
