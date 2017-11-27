package uk.co.lukeyj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.lukeyj.Fake;

@RunWith(MockitoJUnitRunner.class)
public class FakeTest {

	@Test
	public void test() {
		Fake fake = new Fake();
		fake.doSomething();
	}
	
}
