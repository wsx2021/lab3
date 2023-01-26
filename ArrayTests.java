import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {2};
    assertArrayEquals(new int[]{2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvg() {
    double[] input1 = {3,3};
    System.out.println("test3 "+ArrayExamples.averageWithoutLowest(input1)); 
    assertEquals(3,ArrayExamples.averageWithoutLowest(input1),0);

  }
}
