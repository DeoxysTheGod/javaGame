package inventory;

import character.*;
import equipements.*;

public class Inventory {
	private Stuff[] stuffs;
	private int size;

	public Inventory() {
		this.size = 64;
		this.stuffs = new Stuff[size];
		for (int i = 0; i < size; ++i) {
			this.stuffs[i] = new Stuff();
		}
	}

	public Inventory(int size, Stuff[] items) {
		super();
		this.size = size;
		for (int i = 0; i < items.length; ++i) {
			this.stuffs[i] = items[i];
		}
	}

	public String showStockage(Stuff[] items) {
		int sizeRemaining = size - items.length;
		return "" + sizeRemaining + "/" + size;
	}

	public String show() {
		if (stuffs.length == 0)
			return "You don't have any items in your inventory at the moment";
		// Il faudra changer ce str en StringBuilder car la complexité de concatenation
		// d'un String en java est trop élevé, je n'ai pas réussi à le faire
		String str = "";
		for (int i = 0; i < size; ++i) {
			str += stuffs[i].toString();
			str += "\r";
		}
		return str;
		// Exemple : 36/64
	}

	public String showItem(int index) {
		if (index >= size || index < 0)
			return "Out of range";
		return stuffs[index].toString();
	}

	public Inventory addItem(Stuff stuff) {
		for (int i = 0; i < size; ++i) {
			if (stuffs[i].getName() == "Rien")
				continue;
			stuff = stuffs[i];
		}
		return this;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < size; ++i) {
			if (str.isEmpty())
				break;
			str += stuffs[i].toString();
			str += "\r";
		}
		return str;
	}
}
