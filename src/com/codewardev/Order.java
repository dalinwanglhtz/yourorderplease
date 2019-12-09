package com.codewardev;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {

	public static String order(String words) {
		
		if(words.isEmpty()) return "";
		
		String[] word = words.split(" ");
		String patternStr = "[0-9]";
		Pattern pattern = Pattern.compile(patternStr);
		for(int i=0; i<word.length; i++) {
			Matcher matcher = pattern.matcher(word[i]);
			int digit=-1;
			if(matcher.find()) digit = Character.getNumericValue(word[i].charAt(matcher.start()));
			word[i] = digit + word[i];
		}
		
		return Arrays
				.stream(word)
				.sorted()
				.map(x->x.substring(1))
				.collect(Collectors.joining(" "));
	}

}
