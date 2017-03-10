package bbk;

/**
 * Created by fatos on 20/02/2017.
 */
public abstract class MotionSensor implements Sensor {
    public abstract boolean isTriggered();

    public abstract String getLocation();

    public abstract  String getSensorType();
}
