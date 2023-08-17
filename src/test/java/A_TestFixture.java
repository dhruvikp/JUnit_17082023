import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_TestFixture {
	
	@BeforeAll
	public static void beforeall() {
		System.out.println("Before All invoked");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("Before Each invoked..");
	}
	
	@Test
	void test_1() {
		System.out.println("This is testcase 1");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each invoked..");
	}
	
	@Test
	void test_2() {
		System.out.println("This is testcase 2");
	}

	
	@AfterAll
	public static void afterall() {
		System.out.println("After All invoked");
	}
}
