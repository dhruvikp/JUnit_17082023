import static org.mockito.Mockito.atLeastOnce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(JUnitPlatform.class)
public class C_CalculatorTest {
	Calculator calc;
	public ReportPublisher mockPublisher ;

	@BeforeEach
	public void initEach() {
		mockPublisher = Mockito.mock(ReportPublisher.class);
		calc = new Calculator(mockPublisher);

	}

	/**
	 * For a given input, assert expected vs actual
	 * 
	 */
	@Test
	@DisplayName("Test when both arguments positive")
	// @EnabledOnOs({OS.WINDOWS})
	public void test_when_both_args_positive() {

		Mockito.when(mockPublisher.publish()).thenReturn(true);

		// STEP 1: Prepare inputs
		int a = 1;
		int b = 1;

		// Step 2: Gets actual value
		int actual = calc.calculate(a, b);

		// Step 3: Setting expectations
		int expected = 2;

		// Step 4: Assert expected vs actual
		Assertions.assertEquals(expected, actual);
	}

	@Test
	// @Timeout
	// @EnabledOnOs({OS.LINUX})
	public void test_when_both_args_negative() {
		Mockito.when(mockPublisher.publish()).thenReturn(true);
		Assertions.assertEquals(-2, calc.calculate(-1, -1));
	}

	@Test
	// @Timeout
	// @EnabledOnOs({OS.LINUX})
	public void test_when_publisher_false() {
		Mockito.when(mockPublisher.publish()).thenReturn(false);
		Assertions.assertEquals(1, calc.calculate(1, 1));
		Mockito.verify(mockPublisher, atLeastOnce()).publish();
		
	}

}
