package models;

public class Enemy extends Attackers implements Killable{

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

	public Enemy(String name, int pointVal, int dropChance, Projectile gun, String displayValue) {
		super(name);
		setPointVal(pointVal);
		setDropChance(dropChance);
		setGun(gun);
		this.setDisplayValue(displayValue);
	}

	@Override
	public void IDie() {
		System.out.println("The Enemy Has Died");
		
	}
}
