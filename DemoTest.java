import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void testNot() {
        assertEquals(false, Demo.not(false)); //will fail
    }
}
