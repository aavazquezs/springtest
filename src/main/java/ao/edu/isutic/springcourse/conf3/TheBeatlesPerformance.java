package ao.edu.isutic.springcourse.conf3;

import org.springframework.stereotype.Component;

/**
 *
 * @author angel
 */
@Component
public class TheBeatlesPerformance implements Performance{

    @Override
    public void perform() {
        System.out.println("Playing Sgt. Pepper's Lonely Hearts Club Band tracks in a concert");
    }
    
}
