# Projet de création d'un jeu RPG

## Normalisation de l'affichage des équipements

Afin de garder un aspect cohérent dans le jeu, il faut présenter les méthodes `toString()` comme ceci :

```java

public String toString() {
	return super.toString() +
		"%-4d PV".formatted(bonusHp)  +
		"%-4d ATK".formatted(bonusAtk) +
		"%-4d DEF".formatted(bonusDef) +
		"%-4d CC".formatted(bonusCc)  +
		"%-4d Chance".formatted(bonusLuck); 
}

```
