package programmierAufgabe;

public class StehState implements HundStates {

	public StehState() {
		System.out.println("Der Hund steht auf.");
	}

	@Override
	public void sitz(Hund hund) {
		hund.setState(new SitzState());
	}

	@Override
	public void platz(Hund hund) {
		hund.setState(new LiegState());
	}

	@Override
	public void aufstehen(Hund hund) {
		hund.bellen();
	}

}
