package log4j;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;  


public class Log4jDemo {
	
	static Logger log=Logger.getLogger(Log4jDemo.class.getName());
	
	@Test
	public static void demoMethodLog4j()
	{
		
		log.debug("this is debug message");
		log.info("this is info message");
		log.error("this is error message");
		//log.warn("this is warn message");
		log.fatal("this is fatal mesage");
	}

}
