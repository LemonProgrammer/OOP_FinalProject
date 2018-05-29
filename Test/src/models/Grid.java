package models;

import java.util.ArrayList;

public class Grid {
	private ArrayList<ArrayList<Models>> map;

	public ArrayList<ArrayList<Models>> getMap() {
		return map;
	}

	public void setMap(ArrayList<ArrayList<Models>> map) {
		this.map = map;
	}

	public Grid(ArrayList<ArrayList<Models>> map) {
		setMap(map);
	}
}
