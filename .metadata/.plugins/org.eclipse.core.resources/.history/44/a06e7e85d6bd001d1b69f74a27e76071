package inventory;

import equipements.*;

public class Inventory {
	
	private Stuff[] stuffs;
	private int size;

	public Inventory() {
		this.size = 64;
		this.stuffs = new Stuff[size];
	}

	public Inventory(int size, Stuff[] items) {
		super();
		this.size = size;
		for (int i = 0; i < items.length; ++i) {
			this.stuffs[i] = items[i];
		}
	}

	public String showStockage() {
		int sizeRemaining = size - stuffs.length;
		return "" + sizeRemaining + "/" + size;
	}

	public String showItem(int index) {
		if (stuffs[index] == null)
			return "Out of range";
		return stuffs[index].toString();
	}

	public Inventory addItem(Stuff stuff) {
		for (int i = 0; i < size; ++i) {
			if (stuffs[i] != null)
				continue;
			stuffs[i] = stuff;
			break;
		}
		return this;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < size; ++i) {
			if (stuffs[i] == null)
				break;
			str += i + " - " + stuffs[i].getName();
			str += "\n";
		}
		return str;
	}
}
