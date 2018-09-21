package programmierAufgabe;

public class LiegState implements HundStates {

	public LiegState() {
		System.out.println("Der Hund legt sich hin.");
	}

	@Override
	public void sitz(Hund hund) {
		hund.setState(new SitzState());
	}

	@Override
	public void platz(Hund hund) {
		hund.bellen();
	}

	@Override
	public void aufstehen(Hund hund) {
		hund.setState(new StehState());
	}

}
