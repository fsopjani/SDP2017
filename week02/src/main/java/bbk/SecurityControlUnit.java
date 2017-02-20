package bbk;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Component;

/**
 * Created by fatos on 19/02/2017.
 */
@Component
public class SecurityControlUnit extends ControlUnit {

    private void poll(){
        if (LocalTime.now().isAfter(LocalTime.parse( "22:00:00" )) && LocalTime.now().isBefore(LocalTime.parse( "06:00:00" ))) {
            super.pollSensors();
        }
    }
}
