package controller;

import lib.ConsoleIO;
import models.*;

public class Game {

	// Runs the game
	public static void runGame(int choice) {
		// If its the first time to play, create a new game
		// Else, load an existing game
		if (choice == 1) {
			newGame();
		} else {
			loadGame();
		}
	}

	private static void newGame() {
		// Making the player
		ModelComponent player = createPlayer();

		// Making the enemies
		ModelComponent enemies = createEnemy();
		// Making the grid
		ModelComponent[][] map = createGrid(player, enemies);
		// printing the grid
		playerTurn(map, player);
		// checking gameState

	}

	private static Player createPlayer() {
		// Loads the gun with projectiles
		Projectile gun = new Projectile(2, 1);
		// Makes a new player with a gun and Sprite P
		Player player = new Player(" P ", 'A', gun);
		return player;
	}

	private static Enemy createEnemy() {
		Projectile gun = new Projectile(2, 1);
		Enemy player = new Enemy(" E ", 'C', 10, gun);
		return player;
	}

	private static ModelComponent[][] createGrid(ModelComponent player, ModelComponent enemies) {
		ModelComponent[][] map = new ModelComponent[20][13];
		ModelComponent freeSpace = new EmptyTile();
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

	private static void printGrid(ModelComponent[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				System.out.print("[" + map[i][c] + "]");
			}
			System.out.println("\n");
		}
	}

	private static void playerTurn(ModelComponent[][] map, ModelComponent player) {
		ModelComponent freeSpace = new EmptyTile();
		String[] options = { "Move Left", "Move right", "Shoot" };
		boolean gameOver = false;
		do {
			printGrid(map);
			int playerChoice = ConsoleIO.promptForMenuSelection(options, false);
			switch (playerChoice) {
			case 1:
				map = moveLeft(map, player, freeSpace);
				break;
			case 2:
				map = moveRight(map, player, freeSpace);
				break;
			case 3:
				break;
			}
		} while (!gameOver);
	}

	private static ModelComponent[][] moveLeft(ModelComponent[][] map, ModelComponent player,
			ModelComponent freeSpace) {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].equals(player)) {
					if (c - 1 < 0) {
						break;
					} else {
						map[i][c] = freeSpace;
						map[i][c - 1] = player;
					}

				}
			}
		}
		return map;
	}

	private static ModelComponent[][] moveRight(ModelComponent[][] map, ModelComponent player,
			ModelComponent freeSpace) {
		for (int i = 0; i < map.length; i++) {
			for (int c = map[i].length - 1; c > -1; c--) {
				if (map[i][c].equals(player)) {
					System.out.println(c);
					if (c + 1 == map[i].length) {
						break;
					} else {
						map[i][c] = freeSpace;
						map[i][c + 1] = player;
					}
				}
			}
		}
		return map;
	}

	private static void loadGame() {

	}

}
