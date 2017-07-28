package ao.edu.isutic.springcourse.conf1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author angel
 */
public class CavalheiroMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/conf1/cavalheiro.xml");
        Cavalheiro cavalheiro = context.getBean(Cavalheiro.class);
        cavalheiro.embarcarNaCruzada();
        context.close();
    }   
}
