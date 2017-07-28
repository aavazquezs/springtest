package ao.edu.isutic.springcourse.conf3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author angel
 */
public class Conf3Main {
    public static void main(String[] args) {
        ApplicationContext contex = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance performance = contex.getBean(Performance.class);
        performance.perform();
    }
}
