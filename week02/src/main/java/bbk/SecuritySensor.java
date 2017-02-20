package bbk;

/**
 * Created by fatos on 20/02/2017.
 */
public interface SecuritySensor {
    boolean isTriggered();

    String getLocation();

    String getSensorType();
}
