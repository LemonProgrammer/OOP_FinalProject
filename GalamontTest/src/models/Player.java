package models;

public class Player extends Attacker {
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
		int maxCoinAmount = 100000;
		int minCoinAmount = 0;
		if(coins > maxCoinAmount)
		{
			this.coins = maxCoinAmount;
		}
		else if(coins < minCoinAmount)
		{
			this.coins = 0;
		}
		else
		{
			this.coins = coins;
			
		}
	}

	public Player(String name, char lives, Projectile gun) {
		super(name);
		setLives(lives);
		setGun(gun);
	}
}
