import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class D_NestedTest {

	@Nested
	class NestedExample {
		
		@Test
		void test() {
			assertEquals(1, 1);
		}
	}
}
