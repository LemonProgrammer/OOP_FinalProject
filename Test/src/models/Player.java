package models;

public class Player extends Attackers {
	private int score;
	private int coins;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public Player(String name, char lives, Projectiles gun) {
		super(name);
		setLives(lives);
		setGun(gun);
	}
}
