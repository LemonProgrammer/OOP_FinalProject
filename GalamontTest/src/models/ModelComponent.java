package models;

import interfaces.Collidable;
import interfaces.Movable;
import interfaces.Showable;

public abstract class ModelComponent implements  Showable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ModelComponent(String name) {
		setName(name);
	}

	@Override
	public String toString() {
		String res = getName();
		return res;
	}

}
