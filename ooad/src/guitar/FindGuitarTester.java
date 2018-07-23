package guitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	
public static void main(String[] args) { 
	// Set up Rick’s guitar inventory 
	Inventory inventory = new Inventory(); 
	initializeInventory(inventory);
	GuitarSpec whatErinLikes = new GuitarSpec( Builder.FENDER, Type.ELECTRIC, "Stratocastor", Wood.ALDER, Wood.ALDER, 12);
	
	List foundGuitars = inventory.search(whatErinLikes); 
	if (!foundGuitars.isEmpty()) {
		for(Iterator i = foundGuitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar)i.next();
			GuitarSpec spec = guitar.getSpec();
			System.out.println("Erin, you might like this " + 
					spec.getBuilder() + " " + spec.getModel() + " "  + spec.getNumStrings() + "-string " +
					spec.getType() + " guitar:\n " +
					spec.getBackWood() + " back and sides,\n " + 
					spec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!\n -----");
		}
	} else {
		System.out.println("Sorry, Erin, we have nothing for you.");
	} 
} 

	private static void initializeInventory(Inventory inventory) {
		GuitarSpec guitar1 = new GuitarSpec( Builder.FENDER, Type.ELECTRIC, "Stratocastor", Wood.ALDER, Wood.ALDER, 12);
		inventory.addInstrument("V95693", 1499.95, guitar1);
		inventory.addInstrument("V9512", 1549.95, guitar1);
	}
}