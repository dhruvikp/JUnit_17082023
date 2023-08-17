import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_Assertions {

	@Test
	public void assertTests() {
		int actual = 6;
		int expected = 6;
		
		Assertions.assertEquals(expected, actual);
		
		String str = null;
		String str2 = "Some value";
		
		Assertions.assertNull(str);
		Assertions.assertNotNull(str2);
		
		Assertions.assertTrue(actual>5);
		
		String[] a1 = {"A", "B"};
		String[] a2 = {"A", "B"};
		
		Assertions.assertArrayEquals(a1, a2);
	}
}
