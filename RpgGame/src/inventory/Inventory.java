package inventory;

import equipements.*;

public class Inventory {
	
	private Stuff[] stuffs;
	private int nbItems;

	public Inventory() {
		this.stuffs = new Stuff[64];
		this.nbItems = 0;
	}
	
	public Inventory(int size) {
		this.stuffs = new Stuff[size];
		this.nbItems = 0;
	}

	public boolean isFull() {
		return nbItems >= stuffs.length;
	}
	
	public String getStockage() {
		return "" + nbItems + "/" + stuffs.length ;
	}

	public Stuff getItem(int index) {
		if (stuffs[index] == null)
			return null;
		return stuffs[index];
	}
	
	public String getItemInfo(int index) {
		if (stuffs[index] == null)
			return "Out of range";
		return stuffs[index].toString();
	}

	public void removeItem(int index) {
		if (index < stuffs.length) {
			stuffs[index] = null;
		}
		else
			System.out.println("Out of range");
	}
	
	public Inventory addItem(Stuff stuff) {
		if (isFull()) {
			System.out.println("Inventory is full");
		}
		else {
			for (int i = 0; i < stuffs.length; ++i) {
				if (stuffs[i] != null)
					continue;
				stuffs[i] = stuff;
				if (stuff != null)
					++nbItems;
				break;
			}
		}
		return this;
	}

	public String toString() {
		String str = "";
		int cpt = 0;
		for (int i = 0; i < stuffs.length; ++i) {
			if (stuffs[i] == null)
				continue;
			str += i + " - " + stuffs[i].getName();
			str += "\n";
			++cpt;
			if (cpt >= nbItems)
				break;
		}
		return str;
	}
}
