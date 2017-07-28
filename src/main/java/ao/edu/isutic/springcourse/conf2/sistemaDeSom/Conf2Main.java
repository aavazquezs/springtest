package ao.edu.isutic.springcourse.conf2.sistemaDeSom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author angel
 */
public class Conf2Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ao.edu.isutic.springcourse.conf2.sistemaDeSom");
        DiscoCompacto cd = (DiscoCompacto)context.getBean(SgtPeppers.class);
        cd.reproducir();
    }
}
