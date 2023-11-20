package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggtabell;
	int nesteledig;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
		
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
		
	}

	public int getAntall() {
		
		return nesteledig;
		
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int svar = -1;
		for (int i = 0; i < nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				svar = i;
			}
		}
		return svar;
	}

	public boolean finnes(Innlegg innlegg) {
		if (finnInnlegg(innlegg) >= 0) {
			return true;
		}
		
		return false;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggtabell.length) {
			return true;
		}
		
		return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (ledigPlass() && finnes(innlegg) == false) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
			
		}
		
		return false;
		
	}
	
	public String toString() {
		
		StringBuilder resultat = new StringBuilder();
	    resultat.append(getAntall()).append("\n");

	    for (int i = 0; i < nesteledig; i++) {
	        resultat.append(innleggtabell[i].toString());
	    }

	    return resultat.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
