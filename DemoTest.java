import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void testNot() {
        assertEquals(true, Demo.not(false)); //will pass
    }
}
