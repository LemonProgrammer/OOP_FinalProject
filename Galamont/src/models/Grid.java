package models;

public class Grid
{
	private GameModel[][] map;

	private Enemy[] enemies;

	private Projectile[] bullets;

	private GameModel[] edges;

	
	public GameModel[][] getMap()
	{
		return map;
	}

	public void setMap(GameModel[][] map)
	{
		this.map = map;
	}

	public Enemy[] getEnemies()
	{
		return enemies;
	}

	public void setEnemies(Enemy[] enemies)
	{
		this.enemies = enemies;
	}

	public Projectile[] getBullets()
	{
		return bullets;
	}

	public void setBullets(Projectile[] bullets)
	{
		this.bullets = bullets;
	}

	public GameModel[] getEdges()
	{
		return edges;
	}

	public void setEdges(GameModel[] edges)
	{
		this.edges = edges;
	}

}
