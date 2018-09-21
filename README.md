# Artiger_Hund

Dieses Programm stellt einen Artigen Hund dar, welcher Befehle vom User(Menschen)
annehmen kann. 

Moegliche Befehle sind:
0 - Sitz
1 - Steh
2 - Platz

Um das Programm zu starten muss die "mainClass" ausgefuehrt werden. 
Nach dem Starten ist es moeglich die Befehle einzugeben. Um das Programm zu 
beenden kann jede Taste ausser 0, 1 und 2 gedrueckt werden.

Umsetzung erfolgte mit dem Design Pattern -> jeder State wird durch eine eigene 
Klasse repraesentiert,welche von diesem Interface erbt. Sobald ein Statewechsel 
stattfindet, wird die aufgerufene Methode inklusive ihrer Logik in dem jeweiligen
State ausgefuehrt. Die setState() Methode des HundObjekts kriegt den neuen Zustand
in form eines neu erstellten Objekts als Argument uebergeben.