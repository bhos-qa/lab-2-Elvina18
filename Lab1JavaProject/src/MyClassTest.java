import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {
    @Test
    public void testSayHello() {
        MyClass myClass = new MyClass();
        assertEquals("Hello, World!", myClass.sayHello());
    }
}
