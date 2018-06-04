package models;

import java.io.Serializable;

import interfaces.Collidable;
import interfaces.Showable;

public abstract class ModelComponent implements  Showable, Serializable {
	private String name;
	private boolean isOccupied;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ModelComponent(String name) {
		setName(name);
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	@Override
	public String toString() {
		String res = getName();
		return res;
	}

}
