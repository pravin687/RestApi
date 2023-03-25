package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Helper {
	
	public static RequestSpecification req;
	
	public  RequestSpecification requestdata() throws IOException {
		
		if(req==null) {
		PrintStream log=new PrintStream(new FileOutputStream("test-output/logging.txt"));
		req=new RequestSpecBuilder().setBaseUri(getConfigValue("baseURL"))
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).build();
		
		return req;
		}
		
		return req;
		
	}
	
	public static String getConfigValue(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream("//Users//pravintambare//Documents//workspace-spring-tool-suite-4-4.13.1.RELEASE//HotelBooking//src//test//resource//config.propertie");
		prop.load(fs);
		return prop.getProperty(key);
	}
	
	public String getJsonPath(Response response,String key) {
		String result=response.asString();
		JsonPath js=new JsonPath(result);
		return js.get(key).toString();
		
	}

}
