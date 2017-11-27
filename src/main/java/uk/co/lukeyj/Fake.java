package uk.co.lukeyj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fake {

	private static final Logger LOG = LoggerFactory.getLogger(Fake.class);

	public void doSomething() {
		LOG.info("This is a test string.");
	}
	
	
}
