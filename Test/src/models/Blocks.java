package models;

public class Blocks extends Models {

private boolean isDestroyable;

public boolean isDestroyable() {
	return isDestroyable;
}

public void setDestroyable(boolean isDestroyable) {
	
	this.isDestroyable = isDestroyable;
}

	public Blocks(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
