package com.kfprice.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App {

	static Logger Log = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		PropertyConfigurator.configure("C:\\Users\\kemet\\eclipse-workspace\\Log4j\\src\\main\\resources\\log4j.properties");

		Log.debug("Sample debug message");
		Log.info("Sample info message");
		Log.warn("Sample warn message");
		Log.error("Sample error message");
		Log.fatal("Sample fatal message");
		System.out.println("Done");
	}
}