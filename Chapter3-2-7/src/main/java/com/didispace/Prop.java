package com.didispace;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("D:/yexiaoxiao/GitHub/SpringBoot-Learning/Chapter3-2-7/src/main/resources/application.properties");
		Properties properties = new Properties();
		properties.load(is);
		
//		for (Object key: properties.keySet()) {
//			System.out.println(key + " => " + properties.get(key));
//		}
//		
		String DB_URL = properties.getProperty("spring.datasource.url");
		System.out.println("DB_URL => " + DB_URL);
	}

}
