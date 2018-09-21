package programmierAufgabe;

public class SitzState implements HundStates {

	public SitzState() {
		System.out.println("Der Hund setzt sich hin.");
	}

	@Override
	public void sitz(Hund hund) {
		hund.bellen();
	}

	@Override
	public void platz(Hund hund) {
		hund.setState(new LiegState());
	}

	@Override
	public void aufstehen(Hund hund) {
		hund.setState(new StehState());
	}

}
