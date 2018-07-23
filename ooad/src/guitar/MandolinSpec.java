package guitar;

public class MandolinSpec extends InstrumentSpec{

	private Style style;

	public MandolinSpec(Builder builder, Type type, String model, Wood backWood, Wood topWood, Style style) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}
	
	@Override
	public boolean matches(InstrumentSpec otherSpecs) {
		if(!super.matches(otherSpecs))
			return false;
		if(!(otherSpecs instanceof MandolinSpec))
			return false;
		MandolinSpec spec = (MandolinSpec) otherSpecs;
		if (spec.getStyle() != this.style)
			return false;
		
		return true;
	}
}
