package models;

import java.io.Serializable;

public class Grid implements Serializable{
	private ModelComponent[][] map;

	public ModelComponent[][] getMap() {
		return map;
	}

	public void setMap(ModelComponent[][] map) {
		this.map = map;
	}

	public Grid(ModelComponent[][] map) {
		setMap(map);
	}
	
	
	
}
