package guitar;

public class GuitarSpec extends InstrumentSpec {

	private int numStrings;

	public GuitarSpec(Builder builder, Type type, String model, Wood backWood, Wood topWood, int numStrings) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}
	
	@Override
	public boolean matches(InstrumentSpec otherSpecs) {
		if(!super.matches(otherSpecs))
			return false;
		if(!(otherSpecs instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec) otherSpecs;
		if (spec.getNumStrings() != this.numStrings)
			return false;
		
		return true;
	}
}
