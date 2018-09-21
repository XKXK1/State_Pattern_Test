package programmierAufgabe;

public class mainClass {

	public static void main(String[] args) {
		Hund hund = new Hund();
		Mensch mensch = new Mensch(hund);
		Thread thread = new Thread(mensch);
		
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
