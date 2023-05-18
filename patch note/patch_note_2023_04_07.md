# Patch note 07/04/2023
## 1. Ajout de la librairie `Junit`

`Junit 5.8.1` est directement intégré dans le projet il n'est donc pas nécessaire de l'installer.

## 2. Modification du `toString()` de la class `Inventory`

Le `toString()` ne me convenez pas il à donc été modifié afin de ne pas
créer de saut de ligne au début.

## 3. Création de test unitaire pour les méthodes `toString()` et `removeItem()`

Des tests unitaires complémentaires ont été introduit afin de tester les
méthodes `toString()` et `removeItem()`.

> Auteur : Quentin