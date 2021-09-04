package com.advanced.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {

	public static void main(String[] args) {

		String starWarsQuote = "May the force be with you.";

		StringTokenizer stringTokenizer = new StringTokenizer(starWarsQuote);
		
		System.out.println("Number of Tokens/ Words: "+stringTokenizer.countTokens());
		/*
		 * Default delimiter is white space.
		 */
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}

		String starWarsQuote1 = "May,the,force,be,with,you.";

		StringTokenizer stringTokenizer1 = new StringTokenizer(starWarsQuote1,",");
		
		while (stringTokenizer1.hasMoreTokens()) {
			System.out.println(stringTokenizer1.nextToken());
		}
		
		
		System.out.println("String's split finction ,this is recomended by JAVA: ");
		String[] starWarsQuoteWords=starWarsQuote1.split(",",2);
		System.out.println("Number of elements: "+starWarsQuoteWords.length);
		
		for(String starWarsQuoteWord:starWarsQuoteWords){
			System.out.println(starWarsQuoteWord);
		}
	}
}
