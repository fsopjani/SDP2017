package bbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@EnableAutoConfiguration
@Component
@ComponentScan("bbk")
@SpringBootApplication
public class App implements CommandLineRunner {
  private static final String EXIT = "exit";
  private static final String POLL = "poll";

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
}
