package fr.RpgGame.entity.alive.character;

import fr.RpgGame.spell.Spell;

public abstract class CalculationFormula {

	// TODO Comment this method
	public static int getXpAmountNeeded(int lvl) {
		double base = Math.pow(lvl, 0.8);
		
		if (lvl < 57) {
			return  (int)(base * (100 * lvl + 1.5 * Math.pow(lvl, 2.2) + 630 * Math.pow((lvl/20.f), 4)));
		}
		else {
			return (int)(base * 8860 * Math.pow(2, (lvl/21.f)));
		}
	}

	/**
	 * calcul des dégâts :
	 *
	 * a = attaquant
	 * o = opposant
	 *
	 * o.Resistance = 1 - 0.8^( o.Def / 100 )
	 * a.Puissance = 1 + 0.8^( a.Atk / 100 )
	 *
	 * a.Damage = a.dgt_capacité * ( 1 + a.Puissance / 100 ) * (1 - o.Resistance ) * ( 1.1 si crit )
	 * @return [int] : les dommages que l'adversaire va subir
	 *
	 * @author Quentin
	 */
	public static int calcDamage(Character attacker, Spell usedSpell, Character opponent) {
		double damage = usedSpell.getSpellDamage() * (1+attacker.getPuissance())*(1-opponent.getRes());
		return ((int)damage >= 0 ? (int)damage : 0);
	}
}
