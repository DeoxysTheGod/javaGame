package fr.RpgGame.inventory;

import fr.RpgGame.entity.inert.item.Item;

import java.util.Arrays;

public class Inventory {

    private final Item[] storage;

    private int nbItem;

    public Inventory() {
        this.storage = new Item[64];
        this.nbItem = 0;
    }

    public Inventory(int size) {
        this.storage = new Item[size];
        this.nbItem = 0;
    }

    public boolean isFull() {
        return nbItem >= storage.length;
    }

    public String getStockage() {
        return nbItem + "/" + storage.length;
    }

    public Item getItem(int index) {
        if (index > storage.length || index < 0) {
            System.out.println("Impossible d'accéder à cette item !\n");
            return null;
        }
        return (storage[index] != null ? storage[index] : null);
    }

    public String getItemInfo(int index) {
        if (index > storage.length || index < 0)
            return "Impossible d'accéder à cette item !\n";
        return (storage[index] != null ? storage[index].toString() : "Il n'y a pas d'item !\n");
    }

    /**
     * This function remove the item at the specified index and replace it by null value
     *
     * @param index Index of the item to remove
     *
     * @author Quentin
     */
    public void removeItem(int index) {
        if (index > storage.length || index < 0) {
            System.out.println("Impossible d'accéder à cette item !\n");
        } else {
            System.out.println("*" + storage[index].getName() + "*" + " a été supprimé !\n");
            storage[index] = null;
        }
        --nbItem;
    }

    /**
     * This function store an item into the first empty space of the storage
     *
     * @param item Item to add into the storage
     *
     * @author Quentin
     */
    public void addItem(Item item) {
        if (isFull()) {
            System.out.println("L'inventaire est plein !\n");
        } else {
            for (int i = 0; i < storage.length; ++i) {
                if (storage[i] != null)
                    continue;
                storage[i] = item;
                ++nbItem;
                break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int cpt = 0;
        sb.append("** Inventaire **\n\n");
        if (nbItem == 0) {
            sb.append("***vide***\n");
        } else {
            for (int i = 0; i < storage.length; ++i) {
                if (storage[i] == null)
                    continue;
                //noinspection StringConcatenationInsideStringBufferAppend
                sb.append(i + " - " + storage[i].getName() + "\n");
                ++cpt;
                if (cpt >= nbItem)
                    break;
            }
        }
        return sb.toString();
    }

    /**
     * This function swap to value of an Array with the index
     *
     * @param i index of the first value
     * @param j index of the second value
     *
     * @author Quentin
     */
    public void swap(int i, int j) {
        var tmp = storage[i];
        storage[i] = storage[j];
        storage[j] = tmp;
    }

    /**
     * This function remove empty space of the storage
     *
     * @author Quentin
     */
    public void fillEmptySpace() {
        int minInd;
        int nbItemView = 0;
        for (int i = 0; i < storage.length; i++) {
            minInd = i;
            if (nbItemView < nbItem) {
                if (storage[i] == null) {
                    for (int j = i + 1; j < storage.length; j++) {
                        if (storage[j] != null) {
                            minInd = j;
                            ++nbItemView;
                            break;
                        }
                    }
                    swap(i, minInd);
                } else {
                    ++nbItemView;
                }
            } else {
                break;
            }
        }
    }

    /**
     * This function sort Items in storage by name
     *
     * @author Quentin
     */
    public void sortItemByName() {
        fillEmptySpace();
        int minInd; // Index of the word with the smallest letter
        int nbItemView = 0; // Number of Item encountered
        for (int i = 0; i < nbItem; i++) {
            minInd = i; // Put minInd to the index of the compared word
            ++nbItemView;
            for (int j = i + 1; j < nbItem; j++) {
                int cpt = 0; // to browse all the letters of the words
                while ((cpt < storage[j].getName().length() && cpt < storage[i].getName().length())) { // To not exceed the size of the word
                    if (storage[j].getName().toLowerCase().charAt(cpt) < storage[minInd].getName().toLowerCase().charAt(cpt)) { // if second word's letter is lower than first word's letter
                        minInd = j;
                        break;
                    } else if (storage[j].getName().toLowerCase().charAt(cpt) == storage[minInd].getName().toLowerCase().charAt(cpt)) { // if second word's and first word's letter are equals
                        cpt++;
                    } else {
                        break;
                    }
                }
            }
            if (i != minInd) { // swap the value only if there is word smaller than the actual one
                swap(i, minInd);
            }
        }
    }

}