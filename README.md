# ObligSoftware
Jeg lagde filene på nytt med en versjons kontroll i intellj og skrev inn github sin URL. Derfra kopierte jeg de samme filene fra oblig 2 og inn til det nye repoet. 
Etter dette lagde jeg en workflow fra actions funksjonen i github og oppdaterte prosjektet.
Fra yml filen maven-publish så vil testene mine kjøre hver gang jeg trykker commit til github og en test rapport skal komme opp.
Her har jeg problemer da den ikke vil finne testene mine, men kjører uansett. Etter mye hjelp fra google, studass og medelev kom jeg og studass fram til at jeg var så nære en riktig run at jeg kunne få godkjent.
I maven-publish har vi jobben til selve publish som er run_test.
stegene er så å se på repositoryet, sette opp JDK (min er 11) som er for mitt workflow.
jeg har brukt actions/cache@v2 for å gjøre testene mine raskere.
og sist har vi run maven fil test og filen pom.xml

Denne testen vil da ikke kjøre, men verken jeg eller studass fant problemet
