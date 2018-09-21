package programmierAufgabe;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Die Mensch Klasse repraesentiert einen Menschen, der einem Hund Befehle geben
 * kann. Diese Befehle koennen, nachdem der Thread gestartet wird, ueber die
 * Konsole eingegeben werden. Folgende Befehle sind moeglich: 0 - Sitz 1 - Steh
 * 2 - Platz. Falls ein ungueltiger Befehl eingegeben wird, beendet sich das
 * Programm.
 * 
 * @author Derya Glocker
 *
 */
public class Mensch implements Runnable {
	// Enum um Magic-Number zu vermeiden
	public enum States {
		SITZ, STEH, PLATZ
	};

	private Hund hund;
	private boolean running = true;

	public Mensch(Hund hund) {
		this.hund = hund;
	}

	/*
	 * Der vom User eingehende Befehl wird uebersetzt in das jeweilige Kommando an
	 * den Hund. Die ordinal() Methode des Enums wird genutzt um Magic-Numbers zu
	 * vermeiden.
	 */
	private void getCommand(int command) {
		if (command == States.SITZ.ordinal()) {
			hund.sitzen();
		} else if (command == States.STEH.ordinal()) {
			hund.aufstehen();
		} else if (command == States.PLATZ.ordinal()) {
			hund.liegen();
		} else {
			System.out.println("Ungueltiger Command - Programm wird beendet");
			running = false;
		}
	}

	/**
	 * Thread der die Kommandos an einen Hund repraesentiert. Moegliche eingaben
	 * sind 0: Sitz!, 1: Steh! und 2: Platz! Falls ein andere Befehl als 0, 1 oder 2
	 * eingegebn wird, wird das Programm beendet.
	 */
	@Override
	public void run() {
		Scanner reader = new Scanner(System.in);
		int incommingCommand = -1;
		System.out
				.println("Bitte Befehl fuer Hund eingeben(nur Zahlen moeglich):\n0 - Sitz!\n1 - Steh!\n2 - Platz!\n:");
		while (running) {
			// Try-Catch block falls ein nicht Integer Befehl gelesen wird.
			try {
				incommingCommand = reader.nextInt();
				getCommand(incommingCommand);

			} catch (InputMismatchException e) {
				System.out.println("Ungueltiger Command - Programm wird beendet");
				running = false;
			}
		}
		reader.close();
	}
}
