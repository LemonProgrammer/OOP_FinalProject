package control;

<<<<<<< HEAD
import java.io.File;
import java.util.Random;

=======
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
>>>>>>> FernandoBranch
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
<<<<<<< HEAD
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
	Media menuSong;
	MediaPlayer mP;

	public GridPane testGrid;

<<<<<<< HEAD:Galamont/src/application/GameController.java
=======
	public void initialize() {
		menuSong = new Media(new File("bin\\assets\\First Level Song.mp3").toURI().toString());
		mP = new MediaPlayer(menuSong);
		newGame();
		mP.setVolume(.5);
		mP.play();
	}

>>>>>>> ChristianBranch:Galamont/src/control/GameController.java
	public void moveLeftButtonClicked() {
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		spawnEnemy();
		moveEnemy();
		moveBullet();
		moveLeft();
		printGrid();
	}

	public void moveRightButtonClicked() {
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		spawnEnemy();
		moveEnemy();
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
		spawnEnemy();
		moveEnemy();
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
		spawnEnemy();
		printGrid();

	}

	private Player createPlayer() {
		Projectile gun = new Projectile(2, 1, "O");
=======
import javafx.scene.paint.Color;
import javafx.util.Duration;
import models.EmptyTile;
import models.Enemy;
import models.GameModel;
import models.Grid;
import models.Player;
import models.Projectile;

public class GameController
{
	// GameModel[][] map;
	Grid grid = new Grid();

	int[] direction = new int[2];

	Player player;

	EmptyTile freeSpace;

	Projectile projectile;

	Enemy enemies;

	Label label;

	int enemyCount;

	// Media menuSong = new Media(new
	// File("bin\\assets\\TitleSong.mp3").toURI().toString());
	// MediaPlayer mP = new MediaPlayer(menuSong);

	public GridPane testGrid;

	public void initialize()
	{
		setupGame();
		playGame();
		// mP.setVolume(.5);
		// mP.play();
	}

	public void moveLeftButtonClicked()
	{
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		projectile = new Projectile(1, 1);
		moveBullet();
		moveLeft(grid.getMap());
		moveEnemy();
		printGrid(grid.getMap());

	}

	public void moveRightButtonClicked()
	{
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		projectile = new Projectile(1, 1);
		moveBullet();
		moveRight(grid.getMap());
		moveEnemy();
		printGrid(grid.getMap());

	}

	public void shootButtonClicked()
	{
		Node node = testGrid.getChildren().get(0);
		testGrid.getChildren().clear();
		testGrid.getChildren().add(0, node);
		shoot();
		projectile = new Projectile(1, 1);
		moveBullet();
		printGrid(grid.getMap());

	}

	private void setupGame()
	{
		player = createPlayer();
		enemies = createEnemy();
		grid.setMap(createGrid());
		printGrid(grid.getMap());

	}

	private void playGame()
	{

	}

	private Player createPlayer()
	{
		Projectile gun = new Projectile(2, 1);
>>>>>>> FernandoBranch
		Player player = new Player(" P ", 'A', gun);
		return player;
	}

<<<<<<< HEAD
	private Enemy createEnemy() {
		Projectile gun = new Projectile(2, 1, "1");
=======
	private Enemy createEnemy()
	{
		Projectile gun = new Projectile(2, 1);
>>>>>>> FernandoBranch
		Enemy player = new Enemy(" E ", 'C', 10, gun);
		return player;
	}

<<<<<<< HEAD
	private GameModels[][] createGrid() {
		map = new GameModels[20][13];
		freeSpace = new EmptyTile();
		for (int i = 0; i < map.length; i++) {

			for (int c = 0; c < map[i].length; c++) {
				if (i == map.length - 1) {
					map[i][map[i].length / 2] = player;
					map[i][c] = freeSpace;
				} else {
					map[i][c] = freeSpace;
				}
			}
=======
	private GameModel[][] createGrid()
	{

		GameModel[][] map = new GameModel[20][13];
		freeSpace = new EmptyTile();
		int enemyMax = 11;
		int enemyMin = 1;
		for (int i = 0; i < map.length; i++)
		{

			for (int c = 0; c < map[i].length; c++)
			{
				if (i == map.length - 1)
				{
					map[i][map[i].length / 2] = player;
					map[i][c] = freeSpace;
				}
				if (c > enemyMin && c < enemyMax)
				{
					map[i][c] = enemies;
				}
				else
				{
					map[i][c] = freeSpace;
				}
			}

			enemyMax -= 1;
			enemyMin += 1;

>>>>>>> FernandoBranch
		}
		return map;
	}

<<<<<<< HEAD
	private void printGrid() {
		Image image;
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].equals(player)) {
					image = new Image("assets/CharacterIdle.png");
					testGrid.add(new ImageView(image), c, i);

				} else if (map[i][c].toString() == " E ") {
					Label labe = new Label(" E ");
					image = new Image(setEnemyImage());
					testGrid.add(labe, c, i);

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
=======
	private void printGrid(GameModel[][] map)
	{
		Image image;
		for (int i = 0; i < map.length; i++)
		{
			for (int c = 0; c < map[i].length; c++)
			{
				if (map[i][c] == player)
				{
					image = new Image("assets/CharacterIdle.png");
					ImageView iv = new ImageView(image);
					iv.setFitHeight(25);
					iv.setFitWidth(25);
					testGrid.add(iv, c, i);
				}
				else if (map[i][c] == projectile)
				{
					Random rand = new Random();
					int randNum = rand.nextInt(2);
					Image[] bulletImages = new Image[] { new Image("assets/One.png"), new Image("assets/Zero.png") };
					image = bulletImages[randNum];

					// image = new Image("assets/lazer.png");

					// label = new Label(map[i][c].getName());
					// testGrid.add(label, c, i);
					ImageView iv = new ImageView(image);
					iv.setFitHeight(15);
					iv.setFitWidth(15);
					testGrid.add(iv, c, i);

				}
				else if (map[i][c] == enemies)
				{
					image = new Image("assets/Bug(notArmored).png");

					// label = new Label(map[i][c].getName());
					// testGrid.add(label, c, i);
					ImageView iv = new ImageView(image);
					iv.setFitHeight(25);
					iv.setFitWidth(25);
					testGrid.add(iv, c, i);
				}
				else if (map[i][c] == freeSpace)
				{
					label = new Label(freeSpace.getName());
					testGrid.add(label, c, i);
				}
			}
		}
	}

	private GameModel[][] moveLeft(GameModel[][] map)
	{
		for (int i = 0; i < map.length; i++)
		{
			for (int c = 0; c < map[i].length; c++)
			{
				if (map[i][c] == player)
				{
					if (c - 1 < 0)
					{
						break;
					}
					else
					{
>>>>>>> FernandoBranch
						map[i][c] = freeSpace;
						map[i][c - 1] = player;
					}

				}
			}
		}
		return map;
	}

<<<<<<< HEAD
	private GameModels[][] moveRight() {
		for (int i = 0; i < map.length; i++) {
			for (int c = map[i].length - 1; c > -1; c--) {
				if (map[i][c].equals(player)) {
					if (c + 1 == map[i].length) {
						break;
					} else {
=======
	private GameModel[][] moveRight(GameModel[][] map)
	{
		for (int i = 0; i < map.length; i++)
		{
			for (int c = map[i].length - 1; c > -1; c--)
			{
				if (map[i][c] == player)
				{
					if (c + 1 == map[i].length)
					{
						break;
					}
					else
					{
>>>>>>> FernandoBranch
						map[i][c] = freeSpace;
						map[i][c + 1] = player;
					}
				}
			}
		}
		return map;
	}

<<<<<<< HEAD
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
=======
	//////////////////////////////////
	private void moveEnemy()
	{
		for (int x = 0; x < grid.getMap().length; x++)
		{
			GameModel[] currentRow = grid.getMap()[x];
			for (int y = 0; y < currentRow.length; y++)
			{
				// If the grid spot is occupied by Enemy
				if (currentRow[y].getClass() == Enemy.class)
				{
					Random rng = new Random();
					int aiChoice = rng.nextInt(7);
					switch (aiChoice) {
					case 0:

						break;
					case 1:

						break;
					case 2:

						break;
					case 3:

						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;

					}
				}

			}
		}

	}

	private String checkIfCanMove(int x, int y, GameModel currentModel)
	{
		if (lookRight(x, y))
		{
			currentModel.setCanMove(true);
			return "RIGHT";
		}
		else if (lookLeft(x, y))
		{
			currentModel.setCanMove(true);
			return "LEFT";
		}
		else if (lookDown(x, y))
		{
			currentModel.setCanMove(true);
			return "DOWN";
		}
		else if(lookDownLeft(x, y))
		{
			currentModel.setCanMove(true);
			return "DIAGNOLLEFT";
		}
		else if(lookDownRight(x, y))
		{
			currentModel.setCanMove(true);
			return "DIAGNOLRIGHT";
		}
		else
		{
			currentModel.setCanMove(false);;
			return "IDLE";
		}
	}

	private boolean lookRight(int x, int y)
	{
		// check if it can move right
		GameModel[][] map = grid.getMap();

		GameModel[] currentRow = map[x];

		// If the model is on the edge of the map
		if ((y + 1) > currentRow.length)
		{
			return false;
		}
		else
		{
			// Check if the tile to the right is available
			if (currentRow[y + 1] == freeSpace)
			{
				return true;
			}
			else
			{
				return false;
>>>>>>> FernandoBranch
			}
		}
	}

<<<<<<< HEAD
	private void spawnEnemy() {
		Random rand = new Random();
		int spawningChance = rand.nextInt(5);
		if (spawningChance == 1) {
			int spawnIndex = rand.nextInt(12);
			map[0][spawnIndex] = enemies;
		}
	}

	private void moveEnemy() {
		Random rand = new Random();
		int movementDecider = rand.nextInt(3);
		switch (movementDecider + 1) {
		case 1:
			System.out.println("this being called?S");
			emenyLeft();
			break;
		case 2:
			enemyRight();
			break;
		case 3:
			enemyDown();
			break;
		}
	}

	private void emenyLeft() {
		for (int i = 0; i < map.length; i++) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].toString() == " E ") {
					if (map[i][c] == map[i][0]) {
						break;
					} else {
						map[i][c - 1] = enemies;
						map[i][c] = freeSpace;
					}
				}
			}
		}
	}

	private void enemyRight() {
		for (int i = 0; i < map.length; i++) {
			for (int c = map[i].length - 1; c > -1; c--) {
				if (map[i][c].toString() == " E ") {
					if (map[i][c] == map[i][map[i].length - 1]) {
						break;
					} else {
						map[i][c + 1] = enemies;
						map[i][c] = freeSpace;
					}
				}
				if (map[map.length - 1][c].toString() == " E ") {
					map[i][c] = freeSpace;
				}
=======
	private void moveEnemyRight()
	{

	}

	private boolean lookLeft(int x, int y)
	{
		// check if it can move left
		GameModel[][] map = grid.getMap();

		GameModel[] currentRow = map[x];

		// If the model is on the edge of the map
		if ((y - 1) < 0)
		{
			return false;
		}
		else
		{
			// Check if the tile to the left is available
			if (currentRow[y - 1] == freeSpace)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	private void moveEnemyLeft()
	{

	}

	private boolean lookDown(int x, int y)
	{
		// check if it can move right
		GameModel[][] map = grid.getMap();

		// If the model is on the edge of the map
		if ((x + 1) > map.length)
		{
			return false;
		}
		else
		{
			// Check if the tile to the right is available
			if (map[x + 1][y] == freeSpace)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	private void moveEnemyDown()
	{

	}

	private boolean lookDownLeft(int x, int y)
	{
		GameModel[][] map = grid.getMap();
		GameModel[] currentRow = map[x];
		if((x-1) < 0 || (y-1) < 0)
		{
			return false;
		}
		else
		{
			if(map[x-1][y-1] == freeSpace)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	private boolean lookDownRight(int x, int y)
	{
		GameModel[][] map = grid.getMap();
		GameModel[] currentRow = map[x];
		if ((x + 1) > map.length || (y+1) > currentRow.length)
		{
			return false;
		}
		else {
			if(map[x+1][y+1] == freeSpace)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

	}
	
	private void moveEnemyDownRight()
	{

	}

	private boolean checkIfCanShoot(int x, int y)
	{
		GameModel[][] map = grid.getMap();

		// If the model is on the edge of the map
		if ((x + 1) > map.length)
		{
			return false;
		}
		else
		{
			// Check if the tile to the right is available
			if (map[x + 1][y] == freeSpace && map[x+2][y] == freeSpace)
			{
				return true;
			}
			else
			{
				return false;
>>>>>>> FernandoBranch
			}
		}
	}

<<<<<<< HEAD
	private void enemyDown() {
		for (int i = map.length - 1; i > -1; i--) {
			for (int c = 0; c < map[i].length; c++) {
				if (map[i][c].toString() == " E ") {
					if (map[map.length - 1][c].toString() == " E ") {
						map[0][c] = freeSpace;
					} else {
						if (map[i + 1][c].toString() == " O ") {
							menuSong = new Media(new File("bin\\assets\\Hit_Hurt.wav").toURI().toString());
							MediaPlayer mP = new MediaPlayer(menuSong);
							mP.setVolume(.5);
							mP.play();
							map[i + 1][c] = enemies;
							map[i][c] = enemies;
						} else {
							map[i][c] = freeSpace;
							map[i + 1][c] = enemies;
						}
					}
				}
=======
	private void respawnEnemy(GameModel[][] map, int i, int c)
	{
		map[i][c] = freeSpace;
		boolean cantPlace = true;
		int temp = c;
		int max = map[i].length;
		// random respawn
		do
		{
			Random rng = new Random();
			c = rng.nextInt(max);
			if (map[0][c] == freeSpace)
			{
				map[0][c] = enemies;
				System.out.println("Enemy respawned");
				cantPlace = false;
			}
		} while (cantPlace);
		c = temp;
	}

	////////////
	private void moveBullet()
	{
		GameModel[][] map = grid.getMap();

		for (int i = 0; i < map.length; i++)
		{
			for (int c = 0; c < map[i].length; c++)
			{
				if (map[i][c] == projectile)
				{
					if (map[0][c] == projectile)
					{
						map[0][c] = freeSpace;
					}
					else
					{
						if (map[i - 1][c] == enemies)
						{
							map[i - 1][c] = freeSpace;
							map[i][c] = freeSpace;
						}
						else
						{
							map[i - 1][c] = projectile;
							map[i][c] = freeSpace;

						}
					}
					if (i - 1 == -1)
					{
						map[i][c] = freeSpace;
					}
					else
					{
						map[i - 1][c] = projectile;
						map[i][c] = freeSpace;

					}
				}

			}
		}
	}

	private void shoot()
	{
		GameModel[][] map = grid.getMap();
		projectile = new Projectile(1, 1);
		for (int i = 0; i < map.length; i++)
		{
			for (int c = 0; c < map[i].length; c++)
			{
				if (map[i][c] == player)
				{
					map[i - 1][c] = projectile;
				}

>>>>>>> FernandoBranch
			}
		}
	}
}
