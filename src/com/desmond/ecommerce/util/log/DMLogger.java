package com.desmond.ecommerce.util.log;

import org.apache.log4j.Logger;

public class DMLogger {
	private Logger log = null;
	
	public DMLogger(String className) {
		log = Logger.getLogger(className);
	}
	
	public void error(Throwable e, String mesg, Object ... args) {
		String message = String.format(mesg, args);
		log.error(message, e);
	}
	
	public void info(Throwable e, Object mesg, Object ... args) {
		String message = String.format(mesg.toString(), args);
		log.info(message, e);
	}
	
	public void info(Object mes) {
		log.info(mes);
	}
 }
