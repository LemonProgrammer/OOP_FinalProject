package models;

public class Projectile extends ModelComponent {

	// Bullet Strength
	private int bulletStr;
	// Bullet Speed
	private int speed;
	
	private boolean isColliding;

	public int getBulletStr() {
		return bulletStr;
	}

	public void setBulletStr(int bulletStr) {
		this.bulletStr = bulletStr;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isColliding() {
		return isColliding;
	}

	public void setColliding(boolean isColliding) {
		this.isColliding = isColliding;
	}

	public Projectile(int bulletStr, int speed) {
		super(" O ");
		setBulletStr(bulletStr);
		setSpeed(speed);
		setName(" O ");
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

	@Override
	public boolean checkIfIsShowable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setShowability(boolean canShow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getShowabilityStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateShowStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfIsCollidable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIfNextSpotIsOccupied() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIfWillCollideModelsPath() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSpotStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateHealth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDamageDone() {
		// TODO Auto-generated method stub
		
	}
}
