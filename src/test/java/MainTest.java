import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Random;

public class MainTest {

    public class mockRandom extends Random{

        @Override
        public int nextInt(){
            return 0;
        }
    }

    @Mock
    mockRandom mockRandom;

    @Before
    public void before(){
    }


    @Test
    public void myFirstTestTest(){
        Assert.assertNotNull(Main.eldrichBlast());

        int x = 0;
        for(int i = 0 ; i < 1000 ; i++){
            x = Main.eldrichBlast();
            Assert.assertTrue("Wrong number !! you had a: " + x  ,x > 1);
            Assert.assertTrue("Wrong number !! you had a: " + x  ,x < 21);
        }
    }
}
