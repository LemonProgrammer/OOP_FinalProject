package models;

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
	
}
