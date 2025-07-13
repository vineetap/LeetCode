# Testing with JUnit 5

## Overview

This project uses JUnit 5 (Jupiter) for unit testing. JUnit 5 requires Java 8 or higher, and this project is configured to use Java 21.

## Running Tests

### Using Maven

To run all tests using Maven:

```bash
mvn test
```

To run a specific test class:

```bash
mvn test -Dtest=SampleTest
```

### Using IDE

In IntelliJ IDEA, you can run tests by:
1. Right-clicking on a test class or method and selecting "Run"
2. Using keyboard shortcuts (Ctrl+Shift+F10 or ⌃+Shift+R)

## Writing Tests

### Basic Test Structure

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YourTest {

    @Test
    public void testMethod() {
        // Arrange
        int expected = 42;

        // Act
        int actual = someMethod();

        // Assert
        assertEquals(expected, actual);
    }
}
```

### Parameterized Tests

JUnit 5 supports parameterized tests to run the same test with different inputs:

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@ParameterizedTest
@ValueSource(strings = {"racecar", "radar", "level"})
void testPalindromes(String word) {
    assertTrue(isPalindrome(word));
}
```

## Assertions

JUnit 5 provides various assertion methods:

- `assertEquals(expected, actual)` - Checks that two values are equal
- `assertTrue(condition)` - Checks that a condition is true
- `assertFalse(condition)` - Checks that a condition is false
- `assertNotNull(object)` - Checks that an object is not null
- `assertThrows(exceptionClass, executable)` - Checks that an exception is thrown

## Test Lifecycle

Use annotations to control test lifecycle:

- `@BeforeAll` - Run once before all tests
- `@BeforeEach` - Run before each test
- `@AfterEach` - Run after each test
- `@AfterAll` - Run once after all tests

## Learn More

- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [JUnit 5 API Documentation](https://junit.org/junit5/docs/current/api/)
