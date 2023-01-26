import static org.junit.Assert.*;

import org.junit.*;
import java.util.Arrays;
import java.util.List;
class StringCheckerClass implements StringChecker { 
 
    List<String> input = Arrays.asList("one", "two", "three");
    public boolean checkString(String s){
        if (input.contains(s)){
            return true;
        }
            
return false;

} }
public class ListTests {
    @Test 
	public void testReverseInPlace() {
    List<String> input1 = Arrays.asList("one", "two", "three");
    StringCheckerClass sc = new StringCheckerClass();
    List<String> output1 = Arrays.asList("one", "two", "three");
    assertArrayEquals(output1.toArray(), ListExamples.filter(input1, sc).toArray());
	}

}
