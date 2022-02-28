import org.junit.Test;
import static org.junit.Assert.*;
import static com.richmond.moduleone.database.TwoDShape.*;

public class HeronTriangleTest {


    public double calArea() {
        return Math.sqrt(calS()*(calS()-side1)*(calS()-side2)*(calS()-side3));

    }
    @Test public void test(){
        assertEquals(Math.sqrt(calS()*(calS()-side1)*(calS()-side2)*(calS()-side3)), calArea(), 0);

    }

}