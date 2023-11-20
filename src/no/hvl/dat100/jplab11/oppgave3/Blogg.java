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
		int svar = 0;
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innlegg.erLik(innleggtabell[i]) == true) {
				svar = i;
			} else {
				svar = -1;
			}
		}
		
		return svar;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean svar = false;
					
		if (finnInnlegg(innlegg) <= 0) {
			svar = true;
		}
		
		return svar;
	}

	public boolean ledigPlass() {
		boolean svar = false;
		if (nesteledig < innleggtabell.length) {
			svar = true;
		}
		
		return svar;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean svar = false;
		
		if (ledigPlass() == true && finnes(innlegg) == false) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			svar = true;
		}
		
		return svar;
		
	}
	
	public String toString() {
		
		String info = ("BILDE\n" + getId()+ "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + getUrl() + "\n");
		
		return info;
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
}
