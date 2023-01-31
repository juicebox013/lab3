import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceTwo () {
    int[] input2 = {4, 5, 6};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{6, 5, 4}, input2);
  }

  @Test
  public void testReveredArray() {
    int[] exampleInput = {1, 2, 3};
    //ArrayExamples.reversed(exampleInput);
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(exampleInput));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {2,3,1,1};
    double expectAvg = 2.5;
    assertEquals(expectAvg, ArrayExamples.averageWithoutLowest(input), 0.0);
  }
}
