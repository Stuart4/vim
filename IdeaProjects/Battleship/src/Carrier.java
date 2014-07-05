/**
 * Created by jake on 7/4/14.
 */
public class Carrier extends Ship implements Damage{
	private final int size = 5;
	private boolean[] damage = new boolean[size];

	public Carrier() {
		super.size = size;
	}

	public void hit (int index){
		if (index < size){
			damage[index] = true;

		}
	}


	public boolean[] getHealth () {
		return damage;
	}

}
