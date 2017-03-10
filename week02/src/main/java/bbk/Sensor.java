package bbk;

public interface Sensor {
  boolean isTriggered ();
  String getLocation();
  String getSensorType();
  int getBatteryPercentage();
}
