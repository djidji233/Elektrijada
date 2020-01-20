package klk;

import java.util.ArrayList;
import java.util.Collections;

public class Test extends Takmicenje {
	
	ArrayList<Takmicar> sviUcesnici = new ArrayList<>();
	
	
	public Test(String naziv) {
		super(naziv);
	}
	
	public void napraviSveUcesnike() {
		for(Ucesnik u: getUcesnici()) {
			if(u instanceof Tim) {
				sviUcesnici.addAll(((Tim)u).getClanovi());
			} else {
				sviUcesnici.add((Takmicar) u);
			}
		}
	}
	

	@Override
	public void dodajUcesnika(Ucesnik u) {
		if(u instanceof Tim) {
			super.getUcesnici().add(u);
		} else if(u instanceof Takmicar) {
			if(((Takmicar) u).getTip().equals(TipTakmicara.INDIVIDUALNI)) {
				super.getUcesnici().add(u);
			}
		}
	}

	@Override
	public String rangLista() {
		String rangLista = "Timski uspesi:\n";
		ArrayList<Tim> timovi = new ArrayList<>();
		napraviSveUcesnike();
		
		for(Ucesnik u: getUcesnici()) {
			if(u instanceof Tim) {
				timovi.add((Tim) u);
			} 
		}
		Collections.sort(timovi);
		Collections.sort(sviUcesnici);
		for(int i=0; i<timovi.size(); i++) {
			rangLista+=timovi.get(i);
			rangLista+="\n";
		}
		rangLista+="\n";
		rangLista+="Individualni uspesi:\n";
		for(int i=0; i<sviUcesnici.size(); i++) {
			rangLista+=sviUcesnici.get(i);
			rangLista+="\n";
		}
		return rangLista;
	}

}
