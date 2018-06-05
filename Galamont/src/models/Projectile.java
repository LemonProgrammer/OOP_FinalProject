package models;

<<<<<<< HEAD
import models.GridSpot;

public class Projectile extends GameModels
{
	private int damage;
	private int health;
	
	public Projectile(int damage, int health, String name)
	{
		super(name);
		setDamage(damage);
		setHealth(health);
	}
	
	public int getDamage()
	{
		return damage;
	}
	public void setDamage(int damage)
	{
		this.damage = damage;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health)
	{
		this.health = health;
	}
	
=======
public class Projectile extends GameModel {

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

	public Projectile(int bulletStr, int speed) {
		super(" O ");
		setBulletStr(bulletStr);
		setSpeed(speed);
		setName(" O ");
	}
>>>>>>> FernandoBranch
}
