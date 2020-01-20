package klk;

import java.util.ArrayList;

public abstract class Takmicenje {
	private String naziv;
	private ArrayList<Ucesnik> ucesnici = new ArrayList<>();
	
	public Takmicenje(String naziv) {
		this.naziv = naziv;
	}
	public abstract void dodajUcesnika(Ucesnik u);
	public abstract String rangLista();
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public ArrayList<Ucesnik> getUcesnici() {
		return ucesnici;
	}
	public void setUcesnici(ArrayList<Ucesnik> ucesnici) {
		this.ucesnici = ucesnici;
	}
	public void odrziTakmicenje() {
		for(Ucesnik u: ucesnici) {
			if(u instanceof Takmicar) {
				((Takmicar)u).radiTakmicenje();
			} else {
				((Tim)u).radiTakmicenje();
			}
		}
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Takmicenje) {
			if(this.getNaziv().equals(((Takmicenje) o).getNaziv())) {
				return true;
			}
		}
			return false;
	}
	@Override
	public String toString() {
		return naziv;
	}
	
}
