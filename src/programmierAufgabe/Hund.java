package programmierAufgabe;

/**
 * Ein Hund-Objekt kann sitzen,liegen und aufstehen und bellen. Des weiteren
 * befindet sich der Hund nach der Erstellung im Steh-State.
 * 
 * @author Derya Glocker
 *
 */
public class Hund {
	private HundStates currentState;

	public Hund() {
		currentState = new StehState();
	}

	public void setState(HundStates state) {
		currentState = state;
	}

	public HundStates getState() {
		return currentState;
	}

	public void sitzen() {
		currentState.sitz(this);
	}

	public void liegen() {
		currentState.platz(this);
	}

	public void aufstehen() {
		currentState.aufstehen(this);
	}

	public void bellen() {
		System.out.println("Hund: Wuff!");
	}

}
