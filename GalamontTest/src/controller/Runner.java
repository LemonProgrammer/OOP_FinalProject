package controller;

import lib.ConsoleIO;
import models.Campaign;

public class Runner {

	public static void run() {
		mainMenu();
	}

	private static void mainMenu() {
		boolean isQuit = false;
		do
		{
			String[] options = { "Play Game", "Load Game", "Shop", "Credits"};
			int choice = ConsoleIO.promptForMenuSelection(options, true);
			Campaign loadedCampaign = null;
			switch (choice) {
			case 1:
				Game.runNewGame();
				break;
			case 2:
				loadedCampaign = Game.loadGame();
				Game.playGame(loadedCampaign);
				break;
			case 3:
				
				break;
			case 4:
				break;
			case 0:
				isQuit = true;
				break;

			}
		}while(!isQuit);
	
	}

}
