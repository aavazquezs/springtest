package ao.edu.isutic.springcourse.conf3;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author angel
 */
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* ao.edu.isutic.springcourse.conf2.sistemaDeSom.DiscoCompacto.playTrack(int))"
            + " && args(trackNumber)")
    public void trackPlayed(int trackNumber) {
    }

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount+1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber)
                ? trackCounts.get(trackNumber) : 0;
    }

    public Map<Integer, Integer> getTrackCounts() {
        return trackCounts;
    }
    
}
