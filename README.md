# Règles du projet
## Affichage des informations des Statistiques

**/!\\ Afin de garantir une unité dans le code l'ordre des statistiques
doit être toujours dans cet ordre. Les valeurs qui sont à 0 ne doivent pas être affiché
sauf pour les statistiques du personnage /!\\**

```java
StringBuilder sb = new StringBuilder();
sb.append("%-4d PV%n".formatted(getHp())
            + "%-4d ATK%n".formatted(getAtk())
            + "%-4d DEF%n".formatted(getDef())
            + "%-4d CC%n".formatted((getCc()))
            + "%-4d Chance%n".formatted(getLuck()));
        System.out.println(sb);
```

