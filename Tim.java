package klk;

import java.util.ArrayList;

public class Tim implements Ucesnik, Comparable<Tim> {
	private String naziv;
	private double osvojenoBodova;
	private ArrayList<Takmicar> clanovi = new ArrayList<>();

	public Tim(String naziv) {
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getOsvojenoBodova() {
		return osvojenoBodova;
	}

	public ArrayList<Takmicar> getClanovi() {
		return clanovi;
	}

	public void setClanovi(ArrayList<Takmicar> clanovi) {
		this.clanovi = clanovi;
	}

	public void radiTakmicenje() {
		osvojenoBodova = 0;
		for (Takmicar t : clanovi) {
			t.radiTakmicenje();
			osvojenoBodova += t.getOsvojenoBodova();
		}
		osvojenoBodova/=clanovi.size();
	}

	public int getBrojClanovaTima() {
		return clanovi.size();
	}

	public void dodajClanaTima(Takmicar t) {
		if (t.getTip().equals(TipTakmicara.CLAN_TIMA) && !clanovi.contains(t)) {
			clanovi.add(t);
			System.out.println("Dodali smo takmicara u tim.");
		} else {
			System.out.println("Takmicar je ili vec u timu ili nije timski igrac.");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Tim) {
			if (this.getNaziv().equals(((Tim) o).getNaziv())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Tim t) {
		if(this.getOsvojenoBodova() > t.getOsvojenoBodova()) {
			return -1;
		} else if(this.getOsvojenoBodova() < t.getOsvojenoBodova()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return naziv + " " + osvojenoBodova;
	}
	

}
