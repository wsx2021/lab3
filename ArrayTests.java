import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,3,6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6,3,1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,2,4,5};
    assertArrayEquals(new int[]{5,4,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvg() {
    double[] input1 = {3,5,3};
    System.out.println("test3 "+ArrayExamples.averageWithoutLowest(input1)); 
    assertEquals(4,ArrayExamples.averageWithoutLowest(input1),0);

  }
}
