# Patch note 08/04/2023
## 1. Ajout des fonctionnalités de tri de l'inventaire
Il est désormais possible de trier l'inventaire par ordre alphabétique.
Vous pouvez accéder à la classe `Inventory` avec le lien ci-dessous.

**Méthode ajoutée :**

```java
public void swap(int i, int j);
```
```java
public void fillEmptySpace();
```
```java
public void sortItemByName();
```

*ref. [Inventory()](https://github.com/DeoxysTheGod/javaGame/blob/6a133fe249e966825c9f0b4ece243e6272365c34/src/inventory/Inventory.java)*

### Remarque :
Des commentaires on été ajouté à certaine méthode de la class `Inventory`.

## 2. Ajout de Test dans `InventoryTest`
Les tests des méthodes `fillEmptySpace()` et `sortItemByName()` ont été ajouté.

## 3. Déplacement de la classe `CalculationFormula`
La classe `CalculationFormula` a été déplacé dans le package `character` et non plus
dans le package `playableCharacter`.

## 4. Changement dans la classe `Item` et ses sous-classes
### 4.1. Changement dans la classe `Item`
L'attribut `description` est désormais privé.
Une méthode `setDescription(String description)` a donc été ajouté.

### 4.2. Changement dans la classe `Stuff`
Les attributs `hp`, `atk`, `def`, `cc` et `luck` sont désormais
privé.

### 4.3. Modification des classes `AmuletRope` et `BeltRope`
Les classes `AmuletRope` et `BeltRope` ont été changé en conséquence
des modifications citées ci-dessus.

### 4.4. Modification de la classe `Consumable`
* Ajout d'un attribut `heal` et du getter et setter de celui-ci.  
* Ajout d'un `toString()`

### 4.5. Ajout de classe dans la catégorie `Consumable`
* Ajout du `Sandhuitre` dans le catégorie `Food`
* Ajout de `LittleHealingPotion` dans la catégori `Potion`

> Auteur : Quentin