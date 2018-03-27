import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class rectangleTest {

    @Test
    public void rectangle_area_test(){
        Rectangle rec = new Rectangle();

        assertEquals(100, rec.rectangle_area(10, 10));
    }

    @Test
    public void rectangle_primeter_test(){
        Rectangle rec = new Rectangle();
        assertEquals(60, rec.rectangle_primeter(10, 20));
    }

    @Test
    public void should_return_rectangle(){
        Rectangle rec = new Rectangle();
        assertEquals("**\n**\n", rec.draw_rectangle(2,2));
    }
}
