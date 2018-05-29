package models;

public class Projectiles extends Models {

	private int bulletStr;
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

	public Projectiles(int bulletStr, int speed) {
		super(" O ");
		setBulletStr(bulletStr);
		setSpeed(speed);
		setName(" O ");
	}
}
