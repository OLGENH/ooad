package guitar;

public class Guitar {
private String serialNumber; 
private double price;
private GuitarSpec spec;
 
//	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) { 
public Guitar(String serialNumber, double price, GuitarSpec spec) {		
		this.serialNumber = serialNumber;
		this.price = price; 
		this.spec = spec;
	}
	
	public String getSerialNumber() { 
		return serialNumber;
	} 
	
	public double getPrice() { 
		return price;
	} 
	
	public void setPrice(double newPrice) { 
		this.price = newPrice;
	} 
	
	public GuitarSpec getSpec() {
		
		return spec;	
	}
} 