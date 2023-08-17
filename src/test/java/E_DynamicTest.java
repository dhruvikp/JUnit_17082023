import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(JUnitPlatform.class)
public class E_DynamicTest {

	Calculator c;
	ReportPublisher mockPublisher = Mockito.mock(ReportPublisher.class);

	@BeforeEach
	public void intEach() {
		Mockito.when(mockPublisher.publish()).thenReturn(true);
		c = new Calculator(mockPublisher);
	}

	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> tests = new ArrayList<DynamicTest>();
		tests.add(DynamicTest.dynamicTest("Test calculate where both arguments are positive", () -> assertEquals(2, c.calculate(1, 1))));
		tests.add(DynamicTest.dynamicTest("Test calculate where both arguments are negative", () -> assertEquals(-2, c.calculate(-1, -1))));
		tests.add(DynamicTest.dynamicTest("Test calculate where one positive and one negative", () -> assertEquals(0, c.calculate(1, -1))));
		return tests;
	}
}
