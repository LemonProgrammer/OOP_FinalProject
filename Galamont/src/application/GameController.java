package application;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import models.EmptyTile;
import models.Enemy;
import models.GameModels;
import models.Player;
import models.Projectile;

public class GameController {
	GameModels[][] map;
	GameModels player;
	GameModels freeSpace;
	GameModels enemies;
	Label label;
	

	public GridPane testGrid;

	public void mapButtonClicked() {
		newGame();
	}

	public void moveLeftButtonClicked() {
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		moveLeft();
		printGrid();
	}

	public void moveRightButtonClicked() {
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		moveRight();
		printGrid();
	}

	public void shootButtonClicked() {

	}

	private void newGame() {
		player = createPlayer();
		enemies = createEnemy();
		map = createGrid();
		printGrid();

	}

	private Player createPlayer() {
		Projectile gun = new Projectile(2, 1);
		Player player = new Player(" P ", 'A', gun);
		return player;
	}

	private Enemy createEnemy() {
		Projectile gun = new Projectile(2, 1);
		Enemy player = new Enemy(" E ", 'C', 10, gun);
		return player;
	}

	private GameModels[][] createGrid() {
		map = new GameModels[20][13];
		freeSpace = new EmptyTile();
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

	private void printGrid() {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				label = new Label(map[i][c].getName());
				testGrid.add(label, c, i);
				// testGrid = test;
			}
		}
	}

	private GameModels[][] moveLeft() {
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

	private GameModels[][] moveRight() {
		for (int i = 0; i < map.length; i++) {
			for (int c = map[i].length - 1; c > -1; c--) {
				if (map[i][c].equals(player)) {
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
}
