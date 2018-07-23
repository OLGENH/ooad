package guitar;

public abstract class InstrumentSpec {
	private Builder builder; 
	private String model; 
	private Type type; 
	private Wood backWood; 
	private Wood topWood;
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder; 
		this.model = model; 
		this.type = type; 
		this.backWood = backWood;
		this.topWood = topWood;
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
	
	public boolean matches(InstrumentSpec searchSpecs) {
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
		
		return true;
	}
}
