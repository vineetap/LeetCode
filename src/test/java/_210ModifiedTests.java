import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _210ModifiedTests {

    @Test
    @DisplayName("Test with no prerequisites")
    public void testNoPrerequisites() {
        main.java._210 solution = new main.java._210();
        int numCourses = 2;
        int[][] prerequisites = new int[0][0];
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.findOrder(numCourses, prerequisites));
    }

    @Test
    @DisplayName("Test with simple prerequisites")
    public void testSimplePrerequisites() {
        main.java._210 solution = new main.java._210();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.findOrder(numCourses, prerequisites));
    }

    @Test
    @DisplayName("Test with cycle detection")
    public void testCycleDetection() {
        main.java._210 solution = new main.java._210();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        int[] expected = {};
        assertArrayEquals(expected, solution.findOrder(numCourses, prerequisites));
    }

    @Test
    @DisplayName("Test with multiple prerequisites")
    public void testMultiplePrerequisites() {
        main.java._210 solution = new main.java._210();
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] expected = {0, 1, 2, 3};
        assertArrayEquals(expected, solution.findOrder(numCourses, prerequisites));
    }
}
