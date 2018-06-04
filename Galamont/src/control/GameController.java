package control;

import java.io.File;
import java.util.Random;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import models.EmptyTile;
import models.Enemy;
import models.GameModels;
import models.Player;
import models.Projectile;

public class GameController {
	GameModels[][] map;
	GameModels player;
	GameModels freeSpace;
	GameModels projectile;
	GameModels enemies;
	Label label;
	Media menuSong;
	MediaPlayer mP;

	public GridPane testGrid;

	public void initialize() {
		menuSong = new Media(new File("bin\\assets\\TitleSong.mp3").toURI().toString());
		mP = new MediaPlayer(menuSong);
		newGame();
		mP.setVolume(.5);
		// mP.play();
	}

	public void moveLeftButtonClicked() {
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		moveBullet();
		moveLeft();
		printGrid();
	}

	public void moveRightButtonClicked() {
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		moveBullet();
		moveRight();
		printGrid();
	}

	public void shootButtonClicked() {
		menuSong = new Media(
				new File("bin\\assets\\Another Damage,DeathNoise(Careful Very Loud).wav").toURI().toString());
		MediaPlayer mP = new MediaPlayer(menuSong);
		mP.setVolume(.5);
		mP.play();
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		shoot();
		moveBullet();
		printGrid();
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
		Image image;
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].equals(player)) {
					image = new Image("assets/CharacterIdle.png");
					testGrid.add(new ImageView(image), c, i);

				} else if (map[i][c].toString() == " E ") {
					image = new Image(setEnemyImage());
					testGrid.add(new ImageView(image), c, i);

				} else if (map[i][c].toString() == " O ") {
					image = new Image(setBulletImage());
					testGrid.add(new ImageView(image), c, i);
				}
			}
		}
	}

	private String setBulletImage() {
		Random rand = new Random();
		int decider = rand.nextInt(3);
		String res = null;
		switch (decider + 1) {
		case 1:
			res = "assets/HexShot(C1).png";
			break;
		case 2:
			res = "assets/HexShot(E9).png";
			break;
		case 3:
			res = "assets/HexShot(F2).png";
			break;
		}
		return res;
	}

	private String setEnemyImage() {
		Random rand = new Random();
		int decider = rand.nextInt(3);
		String res = "assets/Java.png";
		switch (decider + 1) {
		case 1:
			res = "assets/Java.png";
			break;
		case 2:
			res = "assets/bugIdle1(armored).png";
			break;
		case 3:
			res = "assets/CorruptedData.png";
			break;
		}

		return res;
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

	private void moveBullet() {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].toString() == " O ") {
					if (map[0][c].toString() == " O ") {
						map[0][c] = freeSpace;
					} else {
						if (map[i - 1][c].toString() == " E ") {
							menuSong = new Media(new File("bin\\assets\\Hit_Hurt.wav").toURI().toString());
							MediaPlayer mP = new MediaPlayer(menuSong);
							mP.setVolume(.5);
							mP.play();
							map[i - 1][c] = freeSpace;
							map[i][c] = freeSpace;
						} else {
							map[i][c] = freeSpace;
							map[i - 1][c] = projectile;
						}
					}
				}
			}
		}
	}

	private void shoot() {
		projectile = new Projectile(1, 1);
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].equals(player)) {
					map[i - 1][c] = projectile;
				}
			}
		}
	}
}
