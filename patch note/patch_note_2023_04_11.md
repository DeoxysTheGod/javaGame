# Patch note 11/04/2023
## 1. Ajout de sorts et d'états

Il est désormais possible de créer des sorts et des états.  
Un nouveau package nommé `spell` composé d'une classe `Spell` qui
regroupe les caractéristiques d'un sort et d'une énumération `SpellType`
qui permet de définir si un sort est de type **offensif, défensif, soin, etc.**  

Il existe donc trois nouveaux sorts :
* Boulottage
* Repos
* CoupDePoing

## 2. Modification de la classe `Character`

* La classe `Character` a été modifié afin de prendre en compte la fonctionnalité
cité plus haut.
* L'ajout d'attribut de statisques variables pour permettre la modification
des PV sans perdre les PV de base ou l'ajout de buff à l'attaque par exemple.
* Ajout des `Getter` et `Setter` correspondant au attribut ajouté.
* Ajout de méthode afin de récupérer les sorts connu par le joueur
et de lire leurs informations.
* Ajout d'une méthode afin d'ajouter des sorts à la liste des sorts
connu
* Suppresion des méthodes `calcDamage` et `attack` remplacé par une
méthode plus complète `doABattleAction(Character target, int spellIndex)`
qui permet d'identifier le type du sort et d'agir en conséquence.
* Modification de la méthode `showStats` afin de montrer les attributs
variables et non ceux de base.

## 3. Modification de la classe `PlayableCharacter`

* Modification de l'initialisation de la classe.
* Modification de la méthode `showStats`

## 4. Modification de la méthode `calcDamage` dans la classe `CalculationFormula`

Les modifications de la méthode permettent d'intégrer le système de sort

## 5. Ajout de différent `Item`

Ajout de plusieurs item :
* `PetitePotionDeVie`
* `SandHuitre`
* `TartineDeConfitureSansConfiture`

Traduction de tous les items pouvant contenir un jeu de mot

## 6. Déplacement des classes de personnages

Les classes de personnage ont été déplacé dans le package `trait`
directement et ne sont plus dans des packages séparés.

> Auteur : Quentin