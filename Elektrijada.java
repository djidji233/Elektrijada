package klk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Elektrijada {
	private String naziv;
	private int godina;
	private String grad;
	private ArrayList<Takmicenje> takmicenja = new ArrayList<>();
	
	public Elektrijada(String naziv, int godina, String grad) {
		this.naziv = naziv;
		this.godina = godina;
		this.grad = grad;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getGodina() {
		return godina;
	}
	public String getGrad() {
		return grad;
	}
	public void dodajTakmicenje(Takmicenje t) {
		if(!takmicenja.contains(t)) {
			takmicenja.add(t);
		}
	}
	public void odrziSvaTakmicenja() {
		for(Takmicenje t: takmicenja) {
			t.odrziTakmicenje();
		}
		sacuvajRangListe();
		ispisiRangListe();
	}
	public void sacuvajRangListe() {
		try {
			PrintWriter pw = new PrintWriter(new File("liste.txt"));
			for(Takmicenje t: takmicenja) {
				if(t instanceof Turnir) {
					pw.println(((Turnir)t).rangLista());
					pw.print("\n");
				} else {
					pw.println(((Test)t).rangLista());
					pw.print("\n");
				}
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void ispisiRangListe() {
		for(Takmicenje t: takmicenja) {
			if(t instanceof Turnir) {
				System.out.println(((Turnir)t).rangLista());
			} else {
				System.out.println(((Test)t).rangLista());
			}
		}
	}
	
	
}
