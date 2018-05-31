package models;

public class Block extends ModelComponent {

private boolean isDestroyable;

public boolean isDestroyable() {
	return isDestroyable;
}

public void setDestroyable(boolean isDestroyable) {
	
	this.isDestroyable = isDestroyable;
}

	public Block(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkIfIsShowable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setShowability(boolean canShow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getShowabilityStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateShowStatus() {
		// TODO Auto-generated method stub
		
	}

	}
