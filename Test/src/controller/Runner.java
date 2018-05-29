package controller;

import lib.ConsoleIO;

public class Runner {

	public static void run() {
		mainMenu();
	}

	private static void mainMenu() {
		String[] options = { "Play Game", "Load Game", "Shop", "Credits" };
		int choice = ConsoleIO.promptForMenuSelection(options, false);

		switch (choice) {
		case 1:
			Game.rumGame(choice);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 0:
			break;

		}
	}

}
