import org.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeMethod
    public void SetUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(2, 3), 5, "2+3=5");
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calculator.subtract(2, 3), -1, "2 - 3 should equal -1");
    }

    // Test the multiplication method
    @Test
    public void testMultiplication() {
        Assert.assertEquals(calculator.multiply(2, 3), 6, "2 * 3 should equal 6");
    }

    // Test the division method
    @Test
    public void testDivision() {
        // Test normal division
        Assert.assertEquals(calculator.divide(6, 3), 2, "6 / 3 should equal 2");

        // Test division by zero, expecting an ArithmeticException
        Assert.assertThrows("Phép chia 0", ArithmeticException.class, () -> calculator.divide(10, 0));
    }

}
