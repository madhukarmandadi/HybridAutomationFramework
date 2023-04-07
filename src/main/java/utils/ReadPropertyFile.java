package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import constants.FrameworkConstants;

public class ReadPropertyFile {

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	static {

		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(FrameworkConstants.getConfigfilepath());
			property.load(inputStream);
			property.entrySet().forEach(
					entry -> CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()));

//			  for (Map.Entry<Object, Object> entry : property.entrySet()) {
//			  CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
//			  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) throws Exception {

		String value = "";
		if (Objects.isNull(key)) {
			throw new Exception("property name :" + key + ": is not found. please check config.properties file");
		}
		value = CONFIGMAP.get(key);
		if (Objects.isNull(value) || value.isEmpty()) {
			throw new Exception("Value associated with " + key + " is Null. please check config.properties file");
		}
		return value;
	}

	public static String readValue(String key) throws Exception {

		String value = "";
		if (Objects.isNull(key)) {
			throw new Exception("property name :" + key + ": is not found. please check config.properties file");
		}
		value = property.getProperty(key);
		if (Objects.isNull(value) || value.isEmpty()) {
			throw new Exception("Value associated with " + key + " is Null. please check config.properties file");
		}
		return value;
	}

}
