package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jFileExample {

	static Logger logger=Logger.getLogger(Log4jFileExample.class);//Added Logger
	
	public static void main(String[] args) {
		
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("debug");
		logger.info("This is info");
		logger.warn("This is Warning");
		logger.error("This is Error");
		logger.fatal("This is Fatal");
}
}
