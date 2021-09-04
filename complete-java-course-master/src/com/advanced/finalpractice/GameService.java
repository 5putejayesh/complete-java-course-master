package com.advanced.finalpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameService {

	private static final String SRC_COM_ADVANCED_FINAL_PRACTICE_WORD_TXT = "src/com/advanced/finalpractice/word.txt";

	public void start() throws FileNotFoundException {
		Scanner inputeScanner = new Scanner(System.in);

		String randomWord = getRandomWord();

		// System.out.println(randomWord);

		char[] randomWordArray = randomWord.toCharArray();
		char[] guessingArray = new char[randomWord.length()];
		Arrays.fill(guessingArray, '_');

		int numbefrOfChances = randomWord.length();

		System.out.println("Starting the game: ");
		System.out.println("The length of the word and number of chances: " + numbefrOfChances);
		System.out.println("The word: " + new String(guessingArray));

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("Please type a letter: ");
			char letter = inputeScanner.nextLine().toLowerCase().charAt(0);

			boolean isGuessingCorrect = false;

			for (int i = 0; i < randomWord.length(); i++) {
				if (letter == randomWordArray[i]) {
					guessingArray[i] = letter;
					isGuessingCorrect = true;

				}
			}

			if (isGuessingCorrect) {
				System.out.println("it was a good move.");
				if (isGameFinished(guessingArray)) {
					break;
				}
			} else {
				numbefrOfChances--;

				if (numbefrOfChances == 0) {
					System.out.println("Sorry you run out of chances.");
					System.out.println("The word was: " + randomWord);
					break;
				}
				System.out.println("Your number of chanbces decreased to: " + numbefrOfChances);
				System.out.println("Try another letter.");
			}

			System.out.println("The word: " + new String(guessingArray));
		}
	}

	private boolean isGameFinished(char[] guessingArray) {

		for (int i = 0; i < guessingArray.length; i++) {
			if (guessingArray[i] == '_') {
				return false;
			}
		}
		System.out.println("Congratulations You Won.!");
		System.out.println("The word: " + new String(guessingArray));
		return true;
	}

	private String getRandomWord() throws FileNotFoundException {
		List<String> words = getTheWords();

		Random randomNumber = new Random();
		int randomIndex = randomNumber.nextInt(words.size());
		return words.get(randomIndex);
	}

	private List<String> getTheWords() throws FileNotFoundException {
		List<String> words = new ArrayList<String>();

		File wordsFile = new File(SRC_COM_ADVANCED_FINAL_PRACTICE_WORD_TXT);
		Scanner wordScanner = new Scanner(wordsFile);

		while (wordScanner.hasNextLine()) {
			words.add(wordScanner.nextLine().toLowerCase());
		}
		return words;
	}
}
