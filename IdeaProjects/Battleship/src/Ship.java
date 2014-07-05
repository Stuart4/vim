/**
 * Created by jake on 7/4/14.
 */
public class Ship {
	protected int size = 2;
	private boolean vertical = false;
	private int x = 0;
	private int y = 0;
	private boolean[] damage;

	public void setSize (int size){
		if (size > 0) {
			this.size = size;
		}
	}

	public int getSize() {
		return size;
	}

	public void setOrientation(boolean horizontal){
		if (horizontal){
			vertical = false;
		}
		else {
			vertical = true;
		}
	}

	public boolean getOrientation (){
		if (vertical){
			return true;
		}
		else {
			return false;
		}
	}
}
