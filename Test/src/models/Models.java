package models;

public class Models {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Models(String name) {
		setName(name);
	}

	@Override
	public String toString() {
		String res = getName();
		return res;
	}

}
