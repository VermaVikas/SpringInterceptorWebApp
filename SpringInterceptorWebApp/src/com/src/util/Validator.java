package com.src.util;

public class Validator {
	
	public static boolean isNull(String obj){
		if( obj == null || "null".equals(obj) || "".equals(obj) ){
			return true;
		}
		return false; 
	}
	
	
	public static boolean isNull(Object param){
		if( param == null ){
			return true;
		}
		return false;
	}

}
