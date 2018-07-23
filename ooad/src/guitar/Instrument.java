package guitar;

public abstract class Instrument {

		private String serialNumber;
		private double price;
		private InstrumentSpec spec;
		
		public Instrument(String serialNumber, double price, InstrumentSpec spec) {
			this.serialNumber = serialNumber;
			this.price = price;
			this.spec = spec;
		}
		
		//Get and set methods for serial number and price
		
		
		public InstrumentSpec getSpec() {
			return spec;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setSpec(InstrumentSpec spec) {
			this.spec = spec;
		}
		
		public String getSerialNumber() {
			return serialNumber;
		}
}
