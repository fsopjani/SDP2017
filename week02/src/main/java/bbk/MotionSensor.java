package bbk;

/**
 * Created by fatos on 20/02/2017.
 */
public class MotionSensor implements SecuritySensor {
    @Override
    public boolean isTriggered() {
        return false;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public String getSensorType() {
        return null;
    }

}
