import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testCalculateSum() {
        int result = ElvinaClass.calculateSum(10,5);
        assertEquals(15, result);
    }
}
