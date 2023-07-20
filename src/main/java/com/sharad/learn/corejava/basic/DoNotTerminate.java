package com.sharad.learn.corejava.basic;

import java.security.Permission;
/**
 * @author koxkakku
 */
public class DoNotTerminate {
	 public static class ExitTrappedException extends SecurityException {
			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
}
