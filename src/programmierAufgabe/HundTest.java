package programmierAufgabe;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HundTest {
	Hund hund = new Hund();

	/**
	 * Testen ob der Start-State der vorgegebene "Steh-State" ist.
	 */
	@Test
	void testStartState() {
		Assert.assertEquals(new StehState().getClass(), hund.getState().getClass());
	}

	/**
	 * Testen jedes Kommandos ausgehend vom Sitz-State.
	 */
	@Test
	void testSitzState() {
		hund.sitzen();
		Assert.assertEquals(new SitzState().getClass(), hund.getState().getClass());

		hund.sitzen();
		hund.aufstehen();
		Assert.assertEquals(new StehState().getClass(), hund.getState().getClass());

		hund.sitzen();
		hund.liegen();
		Assert.assertEquals(new LiegState().getClass(), hund.getState().getClass());
	}

	/**
	 * Testen jedes Kommandos ausgehend vom Lieg-State.
	 */
	@Test
	void testLiegState() {
		hund.liegen();
		Assert.assertEquals(new LiegState().getClass(), hund.getState().getClass());

		hund.liegen();
		hund.sitzen();
		Assert.assertEquals(new SitzState().getClass(), hund.getState().getClass());

		hund.liegen();
		hund.aufstehen();
		Assert.assertEquals(new StehState().getClass(), hund.getState().getClass());
	}

	/**
	 * Testen jedes Kommandos ausgehend vom Steh-State.
	 */
	@Test
	void testStehState() {
		hund.aufstehen();
		Assert.assertEquals(new StehState().getClass(), hund.getState().getClass());

		hund.aufstehen();
		hund.liegen();
		Assert.assertEquals(new LiegState().getClass(), hund.getState().getClass());

		hund.aufstehen();
		hund.sitzen();
		Assert.assertEquals(new SitzState().getClass(), hund.getState().getClass());
	}
}
