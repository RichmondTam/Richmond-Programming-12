import org.junit.Test;

import static com.richmond.moduleone.database.Circle.Pi;
import static com.richmond.moduleone.database.TwoDShape.radius;
import static org.junit.Assert.*;

public class CircleTest {


    public double calArea() {
        return radius*radius*Pi;
    }
    @Test public void test(){
        assertEquals(radius*radius*Pi, calArea(),0);
    }
}