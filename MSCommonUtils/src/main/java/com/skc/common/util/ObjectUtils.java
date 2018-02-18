/**
 * 
 */
package com.skc.common.util;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * @author sitakant
 *
 */
public class ObjectUtils {

	public static final String convertToJsonString(Serializable object){
		Gson gson = new Gson();
		String jsonInString = gson.toJson(object);
		System.out.println("Prepared JSON \n "+jsonInString+"\n\n");
		return jsonInString;
	}
	
	public static <T> T convertToJava(String jsonString, Class<T> clazz){
		Gson gson = new Gson();
		T t = gson.fromJson(jsonString, (Class<T>) clazz);
		System.out.println("Prepared Java Object \n"+t+"\n\n");
		return t;
	}
	
}
