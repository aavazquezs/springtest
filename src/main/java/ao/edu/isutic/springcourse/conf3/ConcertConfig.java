package ao.edu.isutic.springcourse.conf3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author angel
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "ao.edu.isutic.springcourse.conf3")
public class ConcertConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
