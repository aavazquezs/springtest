package ao.edu.isutic.springcourse.conf3;

import ao.edu.isutic.springcourse.conf2.sistemaDeSom.DiscoCompacto;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author angel
 */
public class TrackCounterMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TrackCounterConfig.class);
        DiscoCompacto disco = (DiscoCompacto) context.getBean("sgtPeppers");
        disco.playTrack(0);
        disco.playTrack(0);
        disco.playTrack(1);
        disco.playTrack(1);
        disco.playTrack(1);
        disco.playTrack(3);
        disco.playTrack(2);
        disco.playTrack(4);
        TrackCounter trackCounter = context.getBean(TrackCounter.class);
        Map<Integer, Integer> counts = trackCounter.getTrackCounts();
        counts.entrySet().forEach((entry) -> {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Track "+key+" was played "+value+" times");
        });
    }
}
