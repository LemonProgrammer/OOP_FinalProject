package models;

import java.io.Serializable;

public class Campaign implements Serializable {

	private Grid currentLevel;
	private int currentLevelNum;
	private Player currentPlayer;
	private int currentHighScore;

	public Campaign(Grid currentLevel, int currentLevelNum, Player currentPlayer, int currentHighScore) {
		setCurrentLevel(currentLevel);
		setCurrentLevelNum(currentLevelNum);
		setCurrentPlayer(currentPlayer);
		setCurrentHighScore(currentHighScore);
	}
	
	public Grid getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(Grid currentLevel) {
		this.currentLevel = currentLevel;
	}

	public int getCurrentLevelNum() {
		return currentLevelNum;
	}

	public void setCurrentLevelNum(int currentLevelNum) {
		this.currentLevelNum = currentLevelNum;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public int getCurrentHighScore() {
		return currentHighScore;
	}

	public void setCurrentHighScore(int currentHighScore) {
		this.currentHighScore = currentHighScore;
	}


}
