import org.example.W01_ContainsDuplicates;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.example.W01_ContainsDuplicates.containsDuplicates;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {

//    @Rule
//    public ExpectedException expectedException = ExpectedException.none();
//
//    @Test
//    public void noExceptionIsThrown(){
//        int[] noErrorThrown = {1,1,3,3,5,9};
//        boolean result = W01_ContainsDuplicates.containsDuplicates(noErrorThrown);
//        expectedException.expect(ArrayIndexOutOfBoundsException.class);
//    }

    @Test
    public void testEmptyArray(){
        int[] emptyArray = {};
        boolean result = W01_ContainsDuplicates.containsDuplicates(emptyArray);

        assertFalse(result);
    }
    @Test
    public void testOneElementArray(){
        int[] oneElementArray = {1};
        boolean result = W01_ContainsDuplicates.containsDuplicates(oneElementArray);

        assertFalse(result);
    }
    @Test
    public void testOnlyOneDuplicateArray(){
        int[] oneDuplicateElementArray = {1,1,3,4,5,9};
        boolean result = W01_ContainsDuplicates.containsDuplicates(oneDuplicateElementArray);

        assertTrue(result);
    }
    @Test
    public void testMultipleDuplicates(){
        int[] multipleDuplicateElementwArray = {1,1,3,3,5,9};
        boolean result = W01_ContainsDuplicates.containsDuplicates(multipleDuplicateElementwArray);

        assertTrue(result);
    }
    @Test
    public void testArrayUniqueValue(){
        int[] uniqueElementsArray = {1, 2, 3, 4, 5};
        boolean result = W01_ContainsDuplicates.containsDuplicates(uniqueElementsArray);

        assertFalse(result);
    }
}
