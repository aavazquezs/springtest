package ao.edu.isutic.springcourse.conf3;

import ao.edu.isutic.springcourse.conf2.sistemaDeSom.BlankDisc;
import ao.edu.isutic.springcourse.conf2.sistemaDeSom.DiscoCompacto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author angel
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public DiscoCompacto sgtPeppers() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        // ...other tracks omitted for brevity...
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
