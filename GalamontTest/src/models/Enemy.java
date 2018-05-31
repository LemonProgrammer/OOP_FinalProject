package models;

import interfaces.Movable;

public class Enemy extends Attacker implements Movable{

	private int pointVal;
	private int dropChance;
	private boolean isDropping;

	public int getPointVal() {
		return pointVal;
	}

	public void setPointVal(int pointVal) {
		this.pointVal = pointVal;
	}

	public int getDropChance() {
		return dropChance;
	}

	public void setDropChance(int dropChance) {
		this.dropChance = dropChance;
	}

	public boolean isDropping() {
		return isDropping;
	}

	public void setDropping(boolean isDropping) {
		this.isDropping = isDropping;
	}

	public Enemy(String name, int pointVal, int dropChance, Projectile gun) {
		super(name);
		setPointVal(pointVal);
		setDropChance(dropChance);
		setGun(gun);
	}

	@Override
	public boolean checkIfIsMovable(boolean canMove) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIfCanMoveHorizontal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIfCanMoveVertical() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveRight(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeftToRightDiagonally(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRightToLeftDiagonally(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfMoveIsOutOfBounds(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setMovementSpeed(int numOfSpots) {
		// TODO Auto-generated method stub
		
	}
}
