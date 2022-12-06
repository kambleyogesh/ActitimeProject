package com.ACTITIME.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	
public String ReadDataFromProperty(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./TestData/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
}
