# Patch note 15/04/2023

## 1. Ajout de sort et boss

Il est désormais possible de créer un boss :

* "Roi Dairat"


Un nouveau sort a été créé :

* Coup de croc

## 2. Ajout et retrait de `TODO`

Ajout de plusieurs `TODO` à travers le projet notamment pour commenter :

* Commenter la méthode `getXpAmountNeeded` dans `CalculationFormula`
* Expliquer les jeux de mot dans `Boulottage` et `RatTiboise`
* Retrait du `TODO` sur la méthode `doABattleAction` car elle est désormais commenté

## 3. Rapport de bug

J'ai remarqué que l'affichage d'un `mob` ou d'un `boss` n'étais pas fonctionel.
Toutes les statistiques sont de base à 0 malgré les constructeurs, cela est vu sur les anciens test dans le `main` mais aussi les nouveaux que j'ai fait pour ce patchnote.

Il est à noter que seulement l'affichage n'est pas fonctionel, les calculs derrière reste correct.

> Auteur : Angelo