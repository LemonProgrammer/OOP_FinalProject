package models;

import java.util.ArrayList;

public class Grid {
	private ArrayList<ArrayList<ModelComponent>> map;

	public ArrayList<ArrayList<ModelComponent>> getMap() {
		return map;
	}

	public void setMap(ArrayList<ArrayList<ModelComponent>> map) {
		this.map = map;
	}

	public Grid(ArrayList<ArrayList<ModelComponent>> map) {
		setMap(map);
	}
}
