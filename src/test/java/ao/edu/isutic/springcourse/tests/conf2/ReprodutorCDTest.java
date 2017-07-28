package ao.edu.isutic.springcourse.tests.conf2;

import ao.edu.isutic.springcourse.conf2.sistemaDeSom.DiscoCompacto;
import ao.edu.isutic.springcourse.conf2.sistemaDeSom.ReprodutorCDConfig;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author angel
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ReprodutorCDConfig.class)
public class ReprodutorCDTest {
        
    @Autowired
    private DiscoCompacto cd;
    
    @Test
    public void cdNaoNulo(){
        assertNotNull(cd);
    }
}
