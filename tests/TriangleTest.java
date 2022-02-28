

import com.richmond.moduleone.database.Circle;
import com.richmond.moduleone.database.Triangle;
import com.richmond.moduleone.database.TwoDShape;
import com.richmond.moduleone.ui.Main;
import org.junit.Test;

import static com.richmond.moduleone.database.TwoDShape.*;
import static org.junit.Assert.*;
public class TriangleTest {
    public double calArea() {

        return width*height / 2;
    }


    @Test
    public void test() {

        assertEquals(getWidth()*getHeight() / 2, calArea(),0);

    }


}