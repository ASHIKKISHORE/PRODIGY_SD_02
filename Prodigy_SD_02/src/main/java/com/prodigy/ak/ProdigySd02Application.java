package com.prodigy.ak;

import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdigySd02Application {

	public static void main(String[] args) {
		SpringApplication.run(ProdigySd02Application.class, args);
		playGame();
	}

	public static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(100) + 1; // Generates a random number between 1 and 100.
	}

	public static void playGame() {
		int generatedNumber = generateRandomNumber();
		int attempts = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Try to guess the number between 1 and 100.");

		while (true) {
			System.out.print("Enter your guess: ");
			int userGuess = scanner.nextInt();
			attempts++;

			if (userGuess < generatedNumber) {
				System.out.println("Your guess is too low. Try again.");
			} else if (userGuess > generatedNumber) {
				System.out.println("Your guess is too high. Try again.");
			} else {
				System.out.println("Congratulations! You guessed the number correctly: " + generatedNumber);
				System.out.println("It took you " + attempts + " attempts to win the game.");
				break;
			}
		}

		scanner.close();
	}
}
