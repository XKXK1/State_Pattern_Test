# Artiger_Hund

Dieses Programm stellt einen Artigen Hund dar, welcher Befehle vom User(Menschen)<br>
annehmen kann. <br>
<br>
Moegliche Befehle sind:<br>
0 - Sitz<br>
1 - Steh<br>
2 - Platz<br>
<br>
Um das Programm zu starten muss die "mainClass" ausgefuehrt werden. <br>
Nach dem Starten ist es moeglich die Befehle einzugeben. Um das Programm zu <br>
beenden kann jede Taste ausser 0, 1 und 2 gedrueckt werden.<br>
<br>
Umsetzung erfolgte mit dem Design Pattern -> jeder State wird durch eine eigene <br>
Klasse repraesentiert,welche von diesem Interface erbt. Sobald ein Statewechsel <br>
stattfindet, wird die aufgerufene Methode inklusive ihrer Logik in dem jeweiligen<br>
State ausgefuehrt. Die setState() Methode des HundObjekts kriegt den neuen Zustand<br>
in form eines neu erstellten Objekts als Argument uebergeben.<br>