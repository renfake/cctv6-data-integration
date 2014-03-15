package com.cctv6.data.pipeline;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * utility for converting request file content to string
 * @author kriswang
 *
 */
public class RequestFileReader {

	@SuppressWarnings("resource")
	public static String getRequestFromFile(String path) throws Exception {
		Resource resource = new ClassPathResource(path);
		BufferedReader reader = new BufferedReader(new FileReader(resource.getFile().getAbsoluteFile()));
		StringBuffer buffer = new StringBuffer();
		String line = null;
		
		while((line = reader.readLine()) !=null) {
			buffer.append(line);
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		String req = RequestFileReader.getRequestFromFile("/request.txt");
		System.out.println(req);
	}
}
