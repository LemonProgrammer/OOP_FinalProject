package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Random;

import lib.ConsoleIO;
import models.Campaign;
import models.EmptyTile;
import models.Enemy;
import models.Grid;
import models.ModelComponent;
import models.Player;
import models.Projectile;

public class Game {

	// Runs the game
	public static void runNewGame() {
		newGame();
	}

	private static void newGame() {
		// Making the player
		Player player = createPlayer();
		int level = 1;
		int highScore = 0;
		// Making the enemies
		ModelComponent enemies = createEnemy();
		// Making the grid
		Grid map = createGrid(player, enemies);
		Campaign newCampaign = new Campaign(map, level, player, highScore);
		// printing the grid
		playGame(newCampaign);
		// checking gameState

	}

	public static void playGame(Campaign camp) {
		Player currentPlayer = camp.getCurrentPlayer();
		Enemy currentEnemies = createEnemy();
		boolean gameIsOver = false;
		do
		{	
			gameIsOver = playerTurn(camp.getCurrentLevel(), currentPlayer, camp);
			//printGrid(camp.getCurrentLevel().getMap());
			enemyTurn(camp.getCurrentLevel(), currentEnemies, camp);
		} while(!gameIsOver);
	
	}
	
	private static void enemyTurn(Grid currentMap, Enemy enemies, Campaign camp)
	{
		ModelComponent freeSpace = new EmptyTile();
		String[] options = { "Left", "Right", "Shoot", "Down" };
		//boolean gameOver = false;
			//printGrid(currentMap.getMap());
			Random rng = new Random();
			int eChoice = rng.nextInt(options.length);
			switch (eChoice) {
			case 1:
				currentMap.setMap(moveLeft(currentMap.getMap(), enemies, freeSpace));
				break;
			case 2:
				currentMap.setMap(moveRight(currentMap.getMap(), enemies, freeSpace));
				break;
			case 3:
				
				break;
			case 4:
				currentMap.setMap(moveDown(currentMap.getMap(), enemies, freeSpace));
				break;
			}
		
		
	}
	
	private static Enemy spawnEnemy()
	{
		return null;
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

	private static Grid createGrid(ModelComponent player, ModelComponent enemies) {
		ModelComponent[][] map = new ModelComponent[20][13];
		ModelComponent freeSpace = new EmptyTile();
		int enemyMax = 11;
		int enemyMin = 1;
		for (int i = 0; i < map.length; i++) {

			for (int c = 0; c < map[i].length; c++) {
				if (i == map.length - 1) {
					map[i][map[i].length / 2] = player;
					map[i][map[i].length / 2].setOccupied(true);
					
					map[i][c] = freeSpace;
					map[i][c].setOccupied(false);
				} else if (c > enemyMin && c < enemyMax) {
					map[i][c] = enemies;
					map[i][c].setOccupied(true);
				} else {
					map[i][c] = freeSpace;
					map[i][c].setOccupied(false);
				}
			}
			if (i % 2 == 0) {
				enemyMax -= 1;
				enemyMin += 1;
			}
		}
		Grid grid = new Grid(map);
		return grid;
	}

	private static void printGrid(ModelComponent[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				System.out.print("[" + map[i][c] + "]");
			}
			System.out.println("\n");
		}
	}

	private static boolean playerTurn(Grid map, ModelComponent player, Campaign currentCamp) {
		ModelComponent freeSpace = new EmptyTile();
		String[] options = { "Move Left", "Move right", "Shoot", "Quit and Save Game" };
		boolean gameOver = false;
			printGrid(map.getMap());
			int playerChoice = ConsoleIO.promptForMenuSelection(options, false);
			switch (playerChoice) {
			case 1:
				map.setMap(moveLeft(map.getMap(), player, freeSpace));
				break;
			case 2:
				map.setMap(moveRight(map.getMap(), player, freeSpace));
				break;
			case 3:
				break;
			case 4:
				saveGame(currentCamp);
				gameOver = true;
				break;
			}
		return gameOver;
	}

	private static ModelComponent[][] moveLeft(ModelComponent[][] map, ModelComponent model,
			ModelComponent freeSpace) {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c] == model || map[i][c].isOccupied()) {
					if (c - 1 < 0) {
						break;
					} else {
						map[i][c] = freeSpace;
						map[i][c - 1] = model;
						map[i][c-1].setOccupied(true);
						map[i][c].setOccupied(false);
					}

				}
			}
		}
		return map;
	}

	private static ModelComponent[][] moveRight(ModelComponent[][] map, ModelComponent model,
			ModelComponent freeSpace) {
		for (int i = 0; i < map.length; i++) {
			for (int c = map[i].length - 1; c > -1; c--) {
				if (map[i][c] == model || map[i][c].isOccupied()) {
					System.out.println(c);
					if (c + 1 == map[i].length) {
						break;
					} else {
						map[i][c] = freeSpace;
						map[i][c + 1] = model;
						map[i][c+1].setOccupied(true);
						map[i][c].setOccupied(false);
					}
				}
			}
		}
		return map;
	}

	private static ModelComponent[][] moveDown( ModelComponent[][] map, ModelComponent model, ModelComponent freeSpace)
	{
		for (int i = 0; i < map.length; i++) {
			//row
			for (int c = map[i].length - 1; c > -1; c--) {
				//col
				if (map[i][c] == model || map[i][c].isOccupied()) {
					System.out.println(c);
					if (i + 1 == map.length) {
						break;
					} else {
						map[i][c] = freeSpace;
						map[i+1][c] = model;
						map[i][c].setOccupied(false);
						map[i+1][c].setOccupied(true);
					}
				}
			}
		}
		return map;
		
	}

	private static void saveGame(Campaign currentCamp) {
		try {
			//URL file = Game.class.getResource("");
			File saveFile = new File("GameSave.txt");
			FileOutputStream fis = new FileOutputStream(saveFile);
			ObjectOutputStream writer = new ObjectOutputStream(fis);
			writer.writeObject(currentCamp);
			fis.close();
			writer.close();
			System.out.println("Successfully saved the game.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Campaign loadGame() {

		Campaign loadCamp = null;
		try {
			File saveFile = new File("GameSave.txt");
			String path = saveFile.getPath();
			FileInputStream fos = new FileInputStream(path);
			ObjectInputStream reader = new ObjectInputStream(fos);
			loadCamp = (Campaign) reader.readObject();
			fos.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong with the file.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("This file is cannot be loaded to the class due to conflicting data.");
			e.printStackTrace();
		}

		return loadCamp;

	}

}
