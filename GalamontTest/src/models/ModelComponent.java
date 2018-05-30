package models;

public abstract class ModelComponent {
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
