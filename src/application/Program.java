package application;

import java.util.Random;
import java.util.Scanner;

import entitities.Banner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banner banner = new Banner();
		System.out.println(banner);
		System.out.println("Welcome to the new Guess The Number!");
		System.out.print("First, insert your name: ");
		String name = sc.nextLine();
		System.out.println("Ok, " + name + ". Now we're going to generate a number...");
		Random rand = new Random();
		int randomNumber = rand.nextInt(101);
		System.out.println(randomNumber);
		sc.close();
	}
}
