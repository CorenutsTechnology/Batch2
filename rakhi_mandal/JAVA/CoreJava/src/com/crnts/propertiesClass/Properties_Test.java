package com.crnts.propertiesClass;

import java.util.Properties;

public class Properties_Test {

	public static void main(String[] args) {
		Properties properties=new Properties();
//		properties.load(null); CTE
		properties.put(new Student(1,"adam"), new Location("bbsr"));
		properties.put(new Student(21,"jack"), new Location("bbsr"));
		properties.put(new Student(5,"adam"), new Location("bbsr"));
		properties.put(new Student(9,"adam"), new Location("bbsr"));
	}

}
