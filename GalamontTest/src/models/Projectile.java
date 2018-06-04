package models;

public class Projectile extends ModelComponent {

	// Bullet Strength
	private int bulletStr;
	// Bullet Speed
	private int speed;
	
	private boolean isColliding;
	
	private boolean isShowable;

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
	public boolean checkIfIsShowable() {

		return isShowable;
	}

	@Override
	public void setShowability(boolean canShow) {
		// TODO Auto-generated method stub
		this.isShowable = canShow;
	}
	
	}
