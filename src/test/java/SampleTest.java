import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    @Test
    @DisplayName("Simple addition test")
    public void testAddition() {
        assertEquals(4, 2 + 2, "2 + 2 should equal 4");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testIsPositive(int number) {
        assertTrue(number > 0, () -> number + " should be positive");
    }
}
