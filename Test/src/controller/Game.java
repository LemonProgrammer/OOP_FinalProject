package controller;

import lib.ConsoleIO;
import models.Enemy;
import models.Models;
import models.Player;
import models.Projectiles;

public class Game {
	public static void rumGame(int choice) {

		if (choice == 1) {
			newGame();
		} else {
			loadGame();
		}
	}

	private static void newGame() {
		// Making the player
		Models player = createPlayer();

		// Making the enemies
		Models enemies = createEnemy();
		// Making the grid
		Models[][] map = createGrid(player, enemies);
		// printing the grid
		printGrid(map);
		// Player turn

		// checking gameState

	}

	private static Player createPlayer() {
		Projectiles gun = new Projectiles(2, 1);
		Player player = new Player(" P ", 'A', gun);
		return player;
	}

	private static Enemy createEnemy() {
		Projectiles gun = new Projectiles(2, 1);
		Enemy player = new Enemy(" E ", 'C', 10, gun);
		return player;
	}

	private static Models[][] createGrid(Models player, Models enemies) {
		Models[][] map = new Models[20][13];
		Models freeSpace = new Models("EMT");
		int enemyMax = 11;
		int enemyMin = 1;
		for (int i = 0; i < map.length; i++) {

			for (int c = 0; c < map[i].length; c++) {
				if (i == map.length - 1) {
					map[i][map[i].length / 2] = player;
					map[i][c] = freeSpace;
				} else if (c > enemyMin && c < enemyMax) {
					map[i][c] = enemies;
				} else {
					map[i][c] = freeSpace;
				}
			}
			if (i % 2 == 0) {
				enemyMax -= 1;
				enemyMin += 1;
			}
		}
		return map;
	}

	private static void printGrid(Models[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				System.out.print("[" + map[i][c] + "]");
			}
			System.out.println("\n");
		}
	}

	private static void PlayerTurn(Models[][] map) {
		String[] options = { "Move Left", "Move right", "Shoot" };
		int playerChoice = ConsoleIO.promptForMenuSelection(options, false);
		switch (playerChoice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

	private static void loadGame() {

	}

}
