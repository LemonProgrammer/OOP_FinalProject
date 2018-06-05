package models;

public class Attackers extends GameModel {
	private int damage;
	private char lives;
	private int armor;
	private int armorMod;
	private int damageMod;
	private Projectile gun;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public char getLives() {
		return lives;
	}

	public void setLives(char lives) {
		this.lives = lives;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getArmorMod() {
		return armorMod;
	}

	public void setArmorMod(int armorMod) {
		this.armorMod = armorMod;
	}

	public int getDamageMod() {
		return damageMod;
	}

	public void setDamageMod(int damageMod) {
		this.damageMod = damageMod;
	}

	public Projectile getGun() {
		return gun;
	}

	public void setGun(Projectile gun) {
		this.gun = gun;
	}

	public Attackers(String name) {
		super(name);

	}
}
