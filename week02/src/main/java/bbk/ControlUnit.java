package bbk;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ControlUnit {
  private List<Sensor> sensors;

  @Autowired
  TriggerConfigurationProperties triggerConfigurationProperties;

  public void pollSensors() {

    for (Sensor sensor : sensors) {
      if (sensor.isTriggered()) {
        System.out.println("A " + sensor.getSensorType() + " sensor was triggered at " + sensor.getLocation());
      } else {
        System.out.println("Polled " + sensor.getSensorType() + " at " + sensor.getLocation() + " successfully");
      }
    }
  }

  public void setSensors(List<Sensor> sensors) {
    this.sensors = sensors;
  }
}
