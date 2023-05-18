import fr.RpgGame.entity.alive.character.playableCharacter.PlayableCharacter;
import org.junit.jupiter.api.Test;
import fr.RpgGame.trait.Robber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelTest {
	
	
	// Test getXp()
	@Test
	void NewCharacterGetXpShouldReturnZero() {
		PlayableCharacter c = new PlayableCharacter("Robin des Fourré", new Robber());
		assertEquals(0, c.getXp());
	}
	
	// Test setXp()
	@Test
	void giveTenXpShouldReturnTenXp() {
		PlayableCharacter c = new PlayableCharacter("Robin des Fourré", new Robber());
		c.giveXp(10);
		assertEquals(10, c.getXp());
	}
	
	// Test updateStat()
	@Test
	void giveOneHundredTwentyXpShouldReturnNineteen() {
		PlayableCharacter c = new PlayableCharacter("Robin des Fourré", new Robber());
		c.giveXp(120);
		assertEquals(19, c.getXp());
	}
	
	@Test
	void giveThreeHundredSixtyFourXpShouldReturnTwoLvl() {
		PlayableCharacter c = new PlayableCharacter("Robin des Fourré", new Robber());
		c.giveXp(364);
		assertEquals(2, c.getLvl());
	}
	
	@Test
	void giveOneHundredXpAndGiveOneHundredTwentyXpShouldReturnTwoLvl() {
		PlayableCharacter c = new PlayableCharacter("Robin des Fourré", new Robber());
		c.giveXp(100);
		c.giveXp(120);
		assertEquals(2, c.getLvl());
	}
}
