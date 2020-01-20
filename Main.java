package klk;

public class Main {

	public static void main(String[] args) {
		Takmicenje turnir1 = new Turnir("Turnir1");
		Takmicenje turnir2 = new Turnir("Turnir2");
		Takmicenje test1 = new Test("Test1");
		Takmicenje test2 = new Test("Test2");
		
		Takmicar tkm1 = new Takmicar("1", "1", "1", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm2 = new Takmicar("2", "2", "2", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm3 = new Takmicar("3", "3", "3", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm4 = new Takmicar("4", "4", "4", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm5 = new Takmicar("5", "5", "5", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm6 = new Takmicar("6", "6", "6", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm7 = new Takmicar("7", "7", "7", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm8 = new Takmicar("8", "8", "8", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm9 = new Takmicar("9", "9", "9", TipTakmicara.INDIVIDUALNI);
		Takmicar tkm10 = new Takmicar("10", "10", "10", TipTakmicara.INDIVIDUALNI);
		
		Takmicar tkm11 = new Takmicar("11", "11", "11", TipTakmicara.CLAN_TIMA);
		Takmicar tkm12 = new Takmicar("12", "12", "12", TipTakmicara.CLAN_TIMA);
		Takmicar tkm13 = new Takmicar("13", "13", "13", TipTakmicara.CLAN_TIMA);
		Takmicar tkm14 = new Takmicar("14", "14", "14", TipTakmicara.CLAN_TIMA);
		Takmicar tkm15 = new Takmicar("15", "15", "15", TipTakmicara.CLAN_TIMA);
		Takmicar tkm16 = new Takmicar("16", "16", "16", TipTakmicara.CLAN_TIMA);
		Takmicar tkm17 = new Takmicar("17", "17", "17", TipTakmicara.CLAN_TIMA);
		Takmicar tkm18 = new Takmicar("18", "18", "18", TipTakmicara.CLAN_TIMA);
		Takmicar tkm19 = new Takmicar("19", "19", "19", TipTakmicara.CLAN_TIMA);
		Takmicar tkm20 = new Takmicar("20", "20", "20", TipTakmicara.CLAN_TIMA);
		Takmicar tkm21 = new Takmicar("21", "21", "21", TipTakmicara.CLAN_TIMA);
		Takmicar tkm22 = new Takmicar("22", "22", "22", TipTakmicara.CLAN_TIMA);
		Takmicar tkm23 = new Takmicar("23", "23", "23", TipTakmicara.CLAN_TIMA);
		Takmicar tkm24 = new Takmicar("24", "24", "24", TipTakmicara.CLAN_TIMA);
		Takmicar tkm25 = new Takmicar("25", "25", "25", TipTakmicara.CLAN_TIMA);
		Takmicar tkm26 = new Takmicar("26", "26", "26", TipTakmicara.CLAN_TIMA);
		
		Tim tim1 = new Tim("Tim1");
		Tim tim2 = new Tim("Tim2");
		Tim tim3 = new Tim("Tim3");
		Tim tim4 = new Tim("Tim4");
		Tim tim5 = new Tim("Tim5");
		Tim tim6 = new Tim("Tim6");
		Tim tim7 = new Tim("Tim7");
		Tim tim8 = new Tim("Tim8");
		
		tim1.dodajClanaTima(tkm11);
		tim1.dodajClanaTima(tkm12);
		
		tim2.dodajClanaTima(tkm13);
		tim2.dodajClanaTima(tkm14);
		
		tim3.dodajClanaTima(tkm15);
		tim3.dodajClanaTima(tkm16);
		
		tim4.dodajClanaTima(tkm17);
		tim4.dodajClanaTima(tkm18);
		
		tim5.dodajClanaTima(tkm19);
		tim5.dodajClanaTima(tkm20);
		
		tim6.dodajClanaTima(tkm21);
		tim6.dodajClanaTima(tkm22);
		
		tim7.dodajClanaTima(tkm23);
		tim7.dodajClanaTima(tkm24);
		
		tim8.dodajClanaTima(tkm25);
		tim8.dodajClanaTima(tkm26);
		
		turnir1.dodajUcesnika(tim1);
		turnir1.dodajUcesnika(tim8);
		turnir2.dodajUcesnika(tim3);
		turnir2.dodajUcesnika(tim6);
		
		test1.dodajUcesnika(tim2);
		test1.dodajUcesnika(tim4);
		test2.dodajUcesnika(tim5);
		test2.dodajUcesnika(tim7);
		
		test1.dodajUcesnika(tkm1);
		test1.dodajUcesnika(tkm2);
		test1.dodajUcesnika(tkm3);
		test1.dodajUcesnika(tkm4);
		test1.dodajUcesnika(tkm5);
		test2.dodajUcesnika(tkm6);
		test2.dodajUcesnika(tkm7);
		test2.dodajUcesnika(tkm8);
		test2.dodajUcesnika(tkm9);
		test2.dodajUcesnika(tkm10);
		
		Elektrijada elektrijada = new Elektrijada("Elektrijada", 2018, "Beograd");
		elektrijada.dodajTakmicenje(turnir1);
		elektrijada.dodajTakmicenje(turnir2);
		elektrijada.dodajTakmicenje(test1);
		elektrijada.dodajTakmicenje(test2);
		
		elektrijada.odrziSvaTakmicenja();
		
	}

}
