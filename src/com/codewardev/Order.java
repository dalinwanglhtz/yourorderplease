package com.codewardev;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {

	public static String order(String words) {
		
		if(words.isEmpty()) return "";
		
		String[] word = words.split(" ");
		Pattern pattern = Pattern.compile("[0-9]");
		for(int i=0; i<word.length; i++) {
			Matcher matcher = pattern.matcher(word[i]);
			int digit= matcher.find() ? Character.getNumericValue(word[i].charAt(matcher.start())) : -1;
			word[i] = digit + word[i];
		}
		
		return Arrays
				.stream(word)
				.sorted()
				.map(x->x.substring(1))
				.collect(Collectors.joining(" "));
	}

}
