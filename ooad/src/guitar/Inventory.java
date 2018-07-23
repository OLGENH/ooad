package guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory { 
	private List inventory;
	
	public Inventory() {
		inventory = new LinkedList();
	} 
	
//	public void addGuitar(String serialNumber, double price, Builder builder, String model,
//	Type type, Wood backWood, Wood topWood) { 
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) { 
		Instrument instrument = null;
		if (spec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);	
		} else if (spec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);	
		}
		inventory.add(instrument);
	}

	public Instrument getInstrument(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext(); ) {
			Instrument instrument = (Instrument)i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) { 
				return instrument;
			} 
		} 
		return null;
	} 

	public List search(GuitarSpec searchSpecs) {
		List foundGuitars = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar)i.next();
	// Ignore serial number since that’s unique
	// Ignore price since that’s unique
			 if ( guitar.getSpec().matches( searchSpecs ) ) {
					foundGuitars.add(guitar); 
			 }
		 }
		return foundGuitars;
	} 
	
	public List search(MandolinSpec searchSpecs) {
		List foundMandolins = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext(); ) {
			Mandolin mandolin = (Mandolin)i.next();
	// Ignore serial number since that’s unique
	// Ignore price since that’s unique
			 if ( mandolin.getSpec().matches( searchSpecs ) ) {
					foundMandolins.add(mandolin); 
			 }
		 }
		return foundMandolins;
	} 
}