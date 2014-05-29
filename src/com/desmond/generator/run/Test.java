package com.desmond.generator.run;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Test {
	private static Logger log = Logger.getLogger(Test.class.getName());

	public static void main(String[] args) {
		List<String> tmpStrList = new ArrayList<String>();
		tmpStrList.add("");
		log.info(tmpStrList.isEmpty());

	}

}
