package kr.ac.kopo.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HandlerMapping {
	private Map<String, Controller> mappings = new HashMap<>();

	public HandlerMapping(String propLocation) {

		Properties prop = new Properties();

		try {

			InputStream is = new FileInputStream(propLocation);
			prop.load(is);

			//System.out.println(prop.getProperty("/board/list.do"));

			
			Set<Object> keys = prop.keySet(); 
			for (Object key : keys) {
				System.out.println(key);
				String className = prop.getProperty(key.toString());
				System.out.println(className);
			

				Class<?> clz = Class.forName(className);
				

				Constructor<?> constructor = clz.getConstructor();
				mappings.put(key.toString(),(Controller)constructor.newInstance());
			
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	public Controller getController(String uri) {

		return mappings.get(uri);

	}

	

}

