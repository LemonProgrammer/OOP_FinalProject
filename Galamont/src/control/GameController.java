package control;

import java.io.File;

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
<<<<<<< HEAD:Galamont/src/application/GameController.java
	Player player;
	EmptyTile freeSpace;
	Enemy enemies;
=======
	GameModels player;
	GameModels freeSpace;
	GameModels projectile;
	GameModels enemies;
>>>>>>> ChristianBranch:Galamont/src/control/GameController.java
	Label label;
	Media menuSong = new Media(new File("bin\\assets\\TitleSong.mp3").toURI().toString());
	MediaPlayer mP = new MediaPlayer(menuSong);

	public GridPane testGrid;

<<<<<<< HEAD:Galamont/src/application/GameController.java
=======
	public void initialize() {
		newGame();
		mP.setVolume(.5);
		mP.play();
	}

>>>>>>> ChristianBranch:Galamont/src/control/GameController.java
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
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		shoot();
		moveBullet();
		printGrid();
	}

	public void newGame() {
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		
		player = createPlayer();
		enemies = createEnemy();
		map = createGrid();
		printGrid();

	}

	private Player createPlayer() {
		Projectile gun = new Projectile(2, 1, "O");
		Player player = new Player(" P ", 'A', gun);
		return player;
	}

	private Enemy createEnemy() {
		Projectile gun = new Projectile(2, 1, "1");
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
				} else {
					label = new Label(map[i][c].getName());
					testGrid.add(label, c, i);
				}
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

	private void moveBullet() {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].toString() == " O ") {
					if (map[0][c].toString() == " O ") {
						map[0][c] = freeSpace;
					} else {
						if (map[i - 1][c].toString() == " E ") {
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
