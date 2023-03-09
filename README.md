# Projet de création d'un jeu RPG

## Normalisation de l'affichage des équipements

Afin de garder un aspect cohérent dans le jeu, il faut présenter les méthodes `toString()` des équipements comme ceci :

```java

public String toString() {
	return super.toString() +
		"%-4d PV%n".formatted(bonusHp)  +
		"%-4d ATK%n".formatted(bonusAtk) +
		"%-4d DEF%n".formatted(bonusDef) +
		"%-4d CC%n".formatted(bonusCc)  +
		"%-4d Chance%n".formatted(bonusLuck); 
}

```

De même pour toutes les méthodes `toString()` qui représente des statistiques mise à part que le `super.toString()` peut être retiré en fonction du besoin.


**Attention on ne met que les valeurs qui sont différentes de 0**
