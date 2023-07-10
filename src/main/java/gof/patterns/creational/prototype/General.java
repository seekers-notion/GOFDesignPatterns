package gof.patterns.creational.prototype;

// does not support cloning
public class General extends GameUnit {

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals are unique.");
	}

	private String state = "idle";

	public void boostMorale() {
		this.state = "MoralBoost";
	}

	@Override
	public String toString() {
		return "General " + state + " @ " + getPosition().toString();
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported");
	}

}
