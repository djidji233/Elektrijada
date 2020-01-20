package klk;

import java.util.ArrayList;
import java.util.Collections;

public class Turnir extends Takmicenje {
	
	public Turnir(String naziv) {
		super(naziv);
	}
	
	@Override
	public void dodajUcesnika(Ucesnik u) {
		if((u instanceof Tim) && !(super.getUcesnici()).contains(u)) {
			super.getUcesnici().add(u);
			System.out.println("Dodali smo novog ucesnika tipa Tim u Turnir.");
		}
	}

	@Override
	public String rangLista() {
		ArrayList<Tim> timovi = new ArrayList<>();
		String rangLista="";
		for(Ucesnik u: getUcesnici()) {
			if(u instanceof Tim) {
				timovi.add((Tim)u);
			}
		}
		Collections.sort(timovi);
		for(int i=0; i<timovi.size(); i++) {
			rangLista+=timovi.get(i);
			rangLista+="\n";
		}
		return rangLista;
	}

}
