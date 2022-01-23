import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
/**
 * KeyboardDistance Class Tests, 5 total tests to see how functional the class is
 * 
 * @author Kerul Mathur
 * @version 1.0
 */

public class KeyboardDistanceTests {
    KeyboardDistance key = new KeyboardDistance();

  /**
   * Testcase 1 tests between "university" and "univerdity" which
   * should return 7 because the misspelling is at letter 7
   */
    @Test public void testDistance1() {
      int ans = key.distance("univerdity", "university");
      assertEquals("Word: university", 7, ans);
    }
    /**
     * test case two has no difference between the words "mason" and "mason"
     * so it should return a distance of 0
     */
    @Test public void testDistance2() {
      int ans = key.distance("mason", "mason");
      assertEquals("Word: mason", 0, ans);
    }
    /**
     * this is similar to test case 1 with two words and a differene at string distance
     * 5. 
     */
    @Test public void testDistance3() {
      int ans = key.distance("Heavwn", "Heaven");
      assertEquals("Word: university", 5, ans);
    }
    /**
     * this test case has a difference in there words but they are not
     * adjcent. As such we should return the max int value (infinite)
     */
    @Test public void testDistance4() {
      int ans = key.distance("Mason", "MASON");
      assertEquals("Word: MASON", Integer.MAX_VALUE, ans);
    }
    /**
     * This test is similar to test case 1 and 3 and as such should
     * return the value where the mispelling is. 
     */
    @Test public void testDistance5() {
      int ans = key.distance("mathemstics", "mathematics");
      assertEquals("Word: mathematics", 7, ans);
    }
    public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("KeyboardDistanceTests");
    }
}