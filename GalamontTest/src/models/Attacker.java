package models;

public class Attacker extends ModelComponent {

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

	public Attacker(String name) {
		super(name);
		
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



	
	}
