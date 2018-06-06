package models;

import javafx.application.Platform;

public class Player extends Attackers implements Killable {
	private int score;
	private int coins;
	private char lives = 1;

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

	public char getLives() {
		return lives;
	}
	
	public void setLives(char lives) {
		this.lives = lives;
	}
	@Override
	public void IDie() {
		this.setLives((char) (getLives()+1));
		if(this.getLives()>005) {
			System.out.println("The Game is Over");
			Platform.exit();
		}
	}
	public Player(String name, char lives, Projectile gun) {
		super(name);
		setLives(lives);
		setGun(gun);
	}
}


