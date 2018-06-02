package models;

public class GameModels {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameModels(String name) {
		setName(name);
	}

	@Override
	public String toString() {
		String res = getName();
		return res;
	}
}
