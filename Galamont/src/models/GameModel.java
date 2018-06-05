package models;

public abstract class GameModel {
	private String name;

	private boolean canMove;
	
	private int[] location = new int[2];
	
	public GameModel(int x, int y)
	{
		location[0] = x;
		location[1] = y;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanMove()
	{
		return canMove;
	}

	public void setCanMove(boolean canMove)
	{
		this.canMove = canMove;
	}

	public GameModel(String name) {
		setName(name);
	}

	@Override
	public String toString() {
		String res = getName();
		return res;
	}
}
