package guitar;

public class GuitarSpec {

	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	private String model;
	private int numStrings;

	public GuitarSpec(Builder builder, Type type, String model, Wood backWood, Wood topWood, int numStrings) {
		this.builder = builder;
		this.type = type;
		this.model = model;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}
	
	public boolean matches(GuitarSpec searchSpecs) {
		if (searchSpecs.getBuilder() != this.builder)
			return false;
		String model = searchSpecs.getModel().toLowerCase();
		if ((model != null) && (!model.equals("")) && (!model.equals(this.model.toLowerCase()))) 
			return false ;
		if  (searchSpecs.getType() != this.type)
			 return false;
		if (searchSpecs.getBackWood() != this.backWood)
			return false;
		if (searchSpecs.getTopWood() != this.topWood)
			return false;
		if (searchSpecs.getNumStrings() != this.numStrings)
			return false;
		
		return true;
	}
}
