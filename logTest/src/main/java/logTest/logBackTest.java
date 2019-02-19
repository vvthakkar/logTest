package logTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class logBackTest {


	public static void main(String[] args) {
		Logger logger=LoggerFactory.getLogger(logBackTest.class);
		logger.debug("This is debug message");
		logger.info("log message from info" +logBackTest.class.hashCode());
		
		
		//logger.debug("Hello this is a debug message");
		//logger.info("Hello this is an info message");
	  	   	
	}
}

