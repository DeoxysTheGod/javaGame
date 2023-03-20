package equipements;


/**
 * @author Quentin B.
 * 
 * Description :
 * 
 * Cette class permet de donner les attributs qui peuvent être
 * sur un équipement.
 *
 */
public class Stuff {
	/**
	 * <i>String</i> <b>name</b> : nom de l'objet
	 * 
	 * <b>Bonus pouvant être conféré par un équipement</b>
	 * -------------------------------------------------------------
	 * <i>int</i> <b>bonusHp</b> : bonus de points de vies
	 * <i>int</i> <b>bonusAtk</b> : bonus d'attaque
	 * <i>int</i> <b>bonusDef</b> : bonus de défense
	 * <i>int</i> <b>bonusCc</b> : bonus de chance de coup critique
	 * -------------------------------------------------------------
	 * 
	 * <i>double</i> <b>dropRate</b> : Taux de drop de l'objet
	 */
	protected String name;
	
	protected int bonusHp;
	protected int bonusAtk;
	protected int bonusDef;
	protected int bonusCc;
	protected int bonusLuck;

	protected double dropRate;

	public Stuff() {
		this.name = "Rien";

		this.bonusHp = 0;
		this.bonusAtk = 0;
		this.bonusDef = 0;
		this.bonusCc = 0;
		this.bonusLuck = 0;

		this.dropRate = 0.0;
	}

	// Getter

	public String getName() {
		return name;
	}

	public int getBonusHp() {
		return bonusHp;
	}

	public int getBonusAtk() {
		return bonusAtk;
	}

	public int getBonusDef() {
		return bonusDef;
	}

	public int getBonusCc() {
		return bonusCc;
	}

	public int getBonusLuck() {
		return bonusLuck;
	}

	public double getDropRate() {
		return dropRate;
	}	
}
