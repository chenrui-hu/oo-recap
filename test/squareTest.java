import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class squareTest {
    static Square sq;
    @BeforeAll
    public static void setUp(){
        sq = new Square(2);
    }
    @Test
    public void should_return_area(){
        Square sq = new Square(2);
        assertEquals(4.0, sq.square_area());
    }

    @Test
    public void should_return_perimeter(){
        assertEquals(8.0, sq.square_perimeter());
    }
}
