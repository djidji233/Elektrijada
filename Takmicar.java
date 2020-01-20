package klk;

import java.util.Random;

public class Takmicar implements Ucesnik,Comparable<Takmicar>{
	private String imeIPrezime;
	private String fakultet;
	private String brojIndeksa;
	private double osvojenoBodova;
	private TipTakmicara tip;
	
	
	
	public Takmicar(String imeIPrezime, String fakultet, String brojIndeksa, TipTakmicara tip) {
		this.imeIPrezime = imeIPrezime;
		this.fakultet = fakultet;
		this.brojIndeksa = brojIndeksa;
		this.tip = tip;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public String getFakultet() {
		return fakultet;
	}
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	public double getOsvojenoBodova() {
		return osvojenoBodova;
	}
	public TipTakmicara getTip() {
		return tip;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}
	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public void setOsvojenoBodova(double osvojenoBodova) {
		this.osvojenoBodova = osvojenoBodova;
	}
	public void setTip(TipTakmicara tip) {
		this.tip = tip;
	}
	@Override
	public void radiTakmicenje() {
		Random r = new Random();
		osvojenoBodova = r.nextDouble() * 100;
	}
	@Override
	public int compareTo(Takmicar t) {
		if(this.getOsvojenoBodova() > t.getOsvojenoBodova()) {
			return -1;
		} else if(this.getOsvojenoBodova() < t.getOsvojenoBodova()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Takmicar) {
			if((this.getBrojIndeksa()).equals(((Takmicar) o).getBrojIndeksa()) && (this.getFakultet()).equals(((Takmicar) o).getFakultet())) {
				return true;
			} 
		} 
				return false;
	}
	@Override
	public String toString() {
		return imeIPrezime + " " + brojIndeksa+ " " + fakultet + " " + osvojenoBodova;
	}
	
	
}
