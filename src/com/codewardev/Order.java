package com.codewardev;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {

	public static String order(String words) {
		
		if(words.isEmpty()) return "";
		
		Pattern pattern = Pattern.compile("[0-9]");
		return Arrays.stream(words.split(" ")).map(x -> {
			Matcher matcher = pattern.matcher(x);
			int digit= matcher.find() ? Character.getNumericValue(x.charAt(matcher.start())) : -1;
			x = digit + x;
			return x;
		}).sorted().map(x -> x.substring(1)).collect(Collectors.joining(" "));
	}

}
