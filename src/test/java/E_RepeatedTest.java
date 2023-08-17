import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class E_RepeatedTest {

	@Test
	@RepeatedTest(1000)
	void test() {
		assertEquals(1, 1);
	}
}
