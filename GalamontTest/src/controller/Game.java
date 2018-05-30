package controller;

import java.io.File;

import lib.ConsoleIO;
import models.EmptyTile;
import models.Enemy;
import models.ModelComponent;
import models.Player;
import models.Projectile;

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
		printGrid(map);
		// Player turn

		// checking gameState

	}

	private static Player createPlayer() {
		//Loads the gun with projectiles
		Projectile gun = new Projectile(2, 1);
		//Makes a new player with a gun and Sprite P
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

	private static void PlayerTurn(ModelComponent[][] map) {
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
