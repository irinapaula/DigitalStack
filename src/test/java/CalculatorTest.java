import org.example.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);

        assertEquals(7,result);
    }

    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int result = calculator.substract(3, 4);

        assertEquals(-1,result);
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);

        assertEquals(12,result);
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(3, 4);

        assertEquals(0,result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionBy0(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(3, 0);
    }
}
