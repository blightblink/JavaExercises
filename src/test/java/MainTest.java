import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


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

    @BeforeEach
    public void before(){
    }


    @Test
    public void myFirstTestTest(){
        Assertions.assertNotNull(Main.eldrichBlast());

        int x = 0;
        for(int i = 0 ; i < 1000 ; i++){
            x = Main.eldrichBlast();
            Assertions.assertTrue(x > 1,"Wrong number !! you had a: " + x  );
            Assertions.assertTrue(x < 21, "Wrong number !! you had a: " + x  );
        }
    }
}
