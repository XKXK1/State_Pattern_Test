package programmierAufgabe;

/**
 * Repraesentation aller moeglichen States des hundes. Umsetzung mit dem State
 * Design Pattern -> jeder State wird durch eine eigene Klasse repraesentiert,
 * welche von diesem Interface erbt. Sobald ein Statewechsel stattfindet, wird
 * die aufgerufene Methode inklusive ihrer Logik in dem jeweiligen State
 * ausgefuehrt. Die setState() Methode des HundObjekts kriegt den neuen Zustand
 * in form eines neu erstellten Objekts als Argument uebergeben.
 * 
 * @author Derya Glocker
 * 
 *         Das Prinzip des State Patterns habe ich aus dem Buch "Design Patterns
 *         Explained simply" von "Alexander Shvets".
 *
 */
public interface HundStates {
	/**
	 * Befehl um den Hund sitzen zu lassen.
	 * 
	 * @param hund
	 *            ist der Hund welchem der Befehl erteilt wird.
	 */
	public void sitz(Hund hund);

	/**
	 * Befehl um den Hund liegen zu lassen.
	 * 
	 * @param hund
	 *            ist der Hund welchem der Befehl erteilt wird.
	 */
	public void platz(Hund hund);

	/**
	 * Befehl um den Hund aufstehen zu lassen
	 * 
	 * @param hund
	 *            ist der Hund welchem der Befehl erteilt wird.
	 */
	public void aufstehen(Hund hund);
}
