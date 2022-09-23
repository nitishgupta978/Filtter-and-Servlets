package com.spicemoney.person_rest_api.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Component
@Scope("prototype")
public class Utils {
public String getProperty(String key) throws IOException {
    Properties properties=new Properties();
    properties.load(new FileInputStream("C:\\Users\\hp\\Desktop\\person_rest_api\\src\\main\\resources\\myprop.properties"));
    return properties.getProperty(key);
}
}
