import java.util.Set;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class F_DependencyInjectionTest {

	@Test
	@Tag("test-1")
	public void test(TestInfo testInfo, TestReporter testReporter) {
		String displayName = testInfo.getDisplayName();
		Set<String> tags = testInfo.getTags();

		testReporter.publishEntry("Test name", displayName);
	}
}
