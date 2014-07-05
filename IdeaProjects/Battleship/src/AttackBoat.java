/**
 * Created by jake on 7/4/14.
 */
public class AttackBoat extends Ship implements Damage{

	private final int size = 3;
	private boolean[] damage = new boolean[size];

	AttackBoat () {
		super.size = size;
	}

	public void hit (int index) {
		if (index < size) {
			damage[index] = true;
		}
	}

	public boolean[] getHealth() {
		return damage;
	}
}
