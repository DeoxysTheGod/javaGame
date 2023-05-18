import fr.RpgGame.entity.inert.item.Item;
import fr.RpgGame.entity.inert.item.consumable.food.Sandhuitre;
import fr.RpgGame.entity.inert.item.consumable.potion.PetitePotionDeVie;
import fr.RpgGame.entity.inert.item.stuff.armor.amulet.AmuletteDeCorde;

import fr.RpgGame.entity.inert.item.stuff.armor.belt.CeintureDeCorde;
import fr.RpgGame.inventory.Inventory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    /* Test isFull() */
    @Test
    void inventoryFullShouldReturnTrue() {
        Inventory i1 = new Inventory(1);
        i1.addItem(new AmuletteDeCorde());
        assertTrue(i1.isFull());
    }

    @Test
    void inventoryNotFullShouldReturnFalse() {
        Inventory i1 = new Inventory(64);
        i1.addItem(new AmuletteDeCorde());
        assertFalse(i1.isFull());
    }

    /* Test Inventory() */
    @Test
    void inventoryInitNoArgumentShouldReturnZeroOnSixtyFour() {
        Inventory i1 = new Inventory();
        assertEquals("0/64", i1.getStockage());
    }

    @Test
    void inventoryInitArgumentSixteenShouldReturnZeroOnSixteen() {
        Inventory i1 = new Inventory(16);
        assertEquals("0/16", i1.getStockage());
    }

    /* Test getItemInfo */
    @Test
    void getItemInfoWhichExistShouldReturnItemToString() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertEquals(c1.toString(), i1.getItemInfo(0));
    }

    @Test
    void getItemInfoWhichDoesntExistShouldReturnNoItem() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertEquals("Il n'y a pas d'item !\n", i1.getItemInfo(1));
    }

    @Test
    void getItemInfoOutUpperBoundCaseShouldReturnImpossibleItemAccess() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertEquals("Impossible d'accéder à cette item !\n",
                i1.getItemInfo(65));
    }

    @Test
    void getItemInfoOutlowerBoundCaseShouldReturnImpossibleItemAccess() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertEquals("Impossible d'accéder à cette item !\n",
                i1.getItemInfo(-5));
    }

    /* Test getItem */
    @Test
    void getItemWhichExistShouldReturnThisItem() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertEquals(c1, i1.getItem(0));
    }

    @Test
    void getItemWhichDoesntExistShouldReturnNull() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertNull(i1.getItem(1));
    }

    @Test
    void getItemOutOfUpperBoundShouldReturnNull() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertNull(i1.getItem(65));
    }

    @Test
    void getItemOutOfLowerBoundShouldReturnNull() {
        Inventory i1 = new Inventory();
        Item c1 = new AmuletteDeCorde();
        i1.addItem(c1);
        assertNull(i1.getItem(-5));
    }

    /* Test removeItem */
    @Test
    void removeAnItemWhichExistShouldReplaceHimByNull() {
        Inventory i1 = new Inventory();
        i1.addItem(new AmuletteDeCorde());
        i1.addItem(new CeintureDeCorde());
        i1.addItem(new AmuletteDeCorde());
        i1.removeItem(1);
        assertNull(i1.getItem(1));
    }

    /* Test fillEmptySpace */
    @Test
    void storageWithEmptySpaceShouldReturnStorageWithoutEmptySpace() {
        Inventory i1 = new Inventory();
        i1.addItem(new AmuletteDeCorde());
        i1.addItem(new CeintureDeCorde());
        i1.addItem(new CeintureDeCorde());
        i1.addItem(new AmuletteDeCorde());
        i1.removeItem(1);
        Inventory i2 = new Inventory();
        i2.addItem(new AmuletteDeCorde());
        i2.addItem(new CeintureDeCorde());
        i2.addItem(new AmuletteDeCorde());

        i1.fillEmptySpace();
        assertEquals(i2.toString(), i1.toString());
    }

    @Test
    void storageWithTwoEmptySpaceShouldReturnStorageWithoutEmptySpace() {
        Inventory i1 = new Inventory();
        i1.addItem(new AmuletteDeCorde());
        i1.addItem(new CeintureDeCorde());
        i1.addItem(new CeintureDeCorde());
        i1.addItem(new AmuletteDeCorde());
        i1.removeItem(1);
        i1.removeItem(2);
        Inventory i2 = new Inventory();
        i2.addItem(new AmuletteDeCorde());
        i2.addItem(new AmuletteDeCorde());

        i1.fillEmptySpace();
        assertEquals(i2.toString(), i1.toString());
    }

    /* Test sortItemByName */
    @Test
    void unsortedStorageShouldReturnSortedStorage() {
        Inventory i1 = new Inventory();
        i1.addItem(new CeintureDeCorde());
        i1.addItem(new Sandhuitre());
        i1.addItem(new AmuletteDeCorde());
        i1.addItem(new PetitePotionDeVie());
        Inventory i2 = new Inventory();
        i2.addItem(new CeintureDeCorde());
        i2.addItem(new AmuletteDeCorde());
        i2.addItem(new PetitePotionDeVie());
        i2.addItem(new Sandhuitre());

        i1.sortItemByName();
        assertEquals(i2.toString(), i1.toString());
    }

    /* Test toString */
    @Test
    void toStringOfAnEmptyInventoryShouldReturnEmpty() {
        Inventory i1 = new Inventory();
        assertEquals("** Inventaire **\n\n***vide***\n", i1.toString());
    }

    @Test
    void toStringOfANonEmptyInventoryShouldReturnTheNameOfTheInventorySItem() {
        Inventory i1 = new Inventory();
        i1.addItem(new AmuletteDeCorde());
        i1.addItem(new CeintureDeCorde());
        i1.addItem(new AmuletteDeCorde());
        StringBuilder sb = new StringBuilder();
        sb.append("** Inventaire **\n\n");
        sb.append("0 - Collier de corde\n" +
                  "1 - Ceinture de corde\n" +
                  "2 - Collier de corde\n");
        assertEquals(sb.toString(), i1.toString());
    }
}