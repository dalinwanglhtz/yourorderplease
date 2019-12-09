package com.codewardev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {

	public static String order(String words) {
		String[] word = words.split(" ");
		String patternStr = "[0-9]";
		Pattern pattern = Pattern.compile(patternStr);
		for(String w: word) {
			System.out.println(w);
			Matcher matcher = pattern.matcher(w);
			if(matcher.find()) System.out.println("Find: "+w.charAt(matcher.start()));
		}
		return null;
	}

}
