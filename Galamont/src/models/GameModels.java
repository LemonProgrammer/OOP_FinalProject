package models;

public class GameModels {
	private String name;
	private String displayValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameModels(String name) {
		setName(name);
	}
	public String getDisplayValue() {
		return displayValue;
	}
	
	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}
	@Override
	public String toString() {
		String res = getName();
		return res;
	}
}
