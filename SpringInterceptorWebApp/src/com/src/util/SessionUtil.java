package com.src.util;

import javax.servlet.http.HttpSession;

public class SessionUtil {
	
	private static String SESSION_USER_ID = "SESSION_USER_ID";
	private static String SESSION_USER_NAME = "SESSION_USER";
	private static String SESSION_USER_LOGIN_ID = "SESSION_USER_LOGIN_ID";
	private static String SESSION_USER_DESIG = "SESSION_USER_DESIG";
	private static String SESSION_USER_EMAIL = "SESSION_USER_EMAIL";
	private static String AUTHENTICATED = "AUTHENTICATED";
	private static String ISEMP = "ISEMP";
	private static String ISADMIN = "ISADMIN";
	
	
	public static void createSession(HttpSession session,  Integer userId, String userName) {
		session.setAttribute(SESSION_USER_ID, userId);
		session.setAttribute(SESSION_USER_NAME, userName);
		
		session.setAttribute(AUTHENTICATED, true);
	}
	
	public static void InvalidateSession(HttpSession session){
		session.setAttribute(SESSION_USER_ID, null);
		session.setAttribute(SESSION_USER_NAME, null);
		
		session.setAttribute(AUTHENTICATED, null);
		
		session.removeAttribute(SESSION_USER_ID);
		session.removeAttribute(SESSION_USER_NAME);
		session.removeAttribute(AUTHENTICATED);
		
		session.invalidate();
	}
	
	public static boolean isValidSession(HttpSession session){
		if( !Validator.isNull(session.getAttribute(AUTHENTICATED)) && ("true").equals(session.getAttribute(AUTHENTICATED).toString()) ){
			return true;
		}
		return false;
	}
	
	
	public static Integer getSESSION_USER_ID(HttpSession session) {
		return Integer.parseInt(session.getAttribute(SESSION_USER_ID).toString());
	}
	
	public static String getSESSION_USER_NAME(HttpSession session) {
		return session.getAttribute(SESSION_USER_NAME).toString();
	}

	public static String getSESSION_USER_LOGIN_ID(HttpSession session) {
		return session.getAttribute(SESSION_USER_LOGIN_ID).toString();
	}

	public static String getSESSION_USER_DESIG(HttpSession session) {
		return session.getAttribute(SESSION_USER_DESIG).toString();
	}

	public static String getSESSION_USER_EMAIL(HttpSession session) {
		return session.getAttribute(SESSION_USER_EMAIL).toString();
	}

	public static boolean getAUTHENTICATED(HttpSession session) {
		return (boolean)  session.getAttribute(AUTHENTICATED);
	}

	public static boolean getISEMP(HttpSession session) {
		return  (boolean) session.getAttribute(ISEMP);
	}

	public static boolean getISADMIN(HttpSession session) {
		return (boolean) session.getAttribute(ISADMIN);
	}
	
}
