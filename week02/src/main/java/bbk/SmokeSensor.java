package bbk;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("smoke-sensor")
@Scope("prototype")
public class SmokeSensor implements Sensor {
  private String location;
  private String sensorType;
  private int batteryPercentage;
  private int pollCount = 0;

  public SmokeSensor(String location, String sensorType) {
    this.location = location;
    this.sensorType = sensorType;
    this.batteryPercentage = 100;
  }

  @Override
  public boolean isTriggered() {
    pollCount++;
    batteryPercentage -= 0.20 * batteryPercentage;

    if (100 / pollCount <= 10 && batteryPercentage > 0) {
      pollCount = 0;
      return true;
    }

    if (batteryPercentage <= 0) {
      System.out.println("Automatic battery charge, why not!");
      batteryPercentage = 100;
    }
    return false;
  }

  @Override
  public String getLocation() {
    return location;
  }

  @Override
  public String getSensorType() {
    return sensorType;
  }

  @Override
  public int getBatteryPercentage() {
    return batteryPercentage;
  }
}
