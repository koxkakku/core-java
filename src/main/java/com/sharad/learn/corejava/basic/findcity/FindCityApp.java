package com.sharad.learn.corejava.basic.findcity;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindCityApp {
	static Logger logger = Logger.getLogger(FindCityApp.class.getName());

	public static void main(String[] args) throws CityNotFoundException {
		logger.setLevel(Level.INFO);
		try (Scanner sc = new Scanner(System.in)) {
			logger.log(Level.INFO,"Choose search type : {0}", Arrays.toString(AreaSearchType.values()));
			String searchType = sc.next();
			logger.log(Level.INFO,"enter {0} to search : \n",searchType);
			String zipCodeInput = sc.next();
			logger.log(Level.INFO,"{0} wise area List : ",zipCodeInput);
			logger.log(Level.INFO,"{0}",AreaDetailsMap.getSearchResultsByType(AreaSearchType.valueOf(searchType.toUpperCase()),zipCodeInput));		
			
		}

	}

}