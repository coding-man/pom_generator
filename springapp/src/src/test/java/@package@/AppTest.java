package @package@;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test.xml"})
public class AppTest {
    // @Autowired
    //private BeanType bean;
    
    @Test
    public void testApp() throws Exception {
        assertTrue(true);
    }
}