
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class circleTest {
    static Circle cic;
    @BeforeAll
    public static void setUp(){
        cic = new Circle(3);
    }


    @Test
    public void should_return_area(){


        assertEquals(28.26, cic.circle_area());
    }

    @Test
    public void should_return_perimeter(){
        assertEquals(18.84, cic.circle_perimeter());
    }
}
