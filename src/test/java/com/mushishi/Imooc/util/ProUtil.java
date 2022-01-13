package com.mushishi.Imooc.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProUtil {
	public Properties Pro;
	public ProUtil(String FilePath) {
		Pro = RedProperties(FilePath);
	}
	private Properties RedProperties(String FilePath) {
		Properties properties = new Properties();
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(FilePath);
			BufferedInputStream In = new BufferedInputStream(fileInputStream);
			properties.load(In);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
		
	}

	public String GetPro(String key) {
		String value;
		if (Pro.containsKey(key)) {
			value = Pro.getProperty(key);
			return value;
		}else {
			return "";
		}
	}
	public int GetLines() {
		return Pro.size();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String FilePath;
		ProUtil ProU = new ProUtil("element.properties");
		System.out.println(ProU.GetPro("username1"));
	}

}
