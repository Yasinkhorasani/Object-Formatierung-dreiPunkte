package de.bikeshop.wuensche;

public class PunktPunktPunkt {

	public static void main(String[] args) {
		int zahl1 = 12;
		int zahl2 = 14;
		int zahl3 = 7;
		int zahl4 = 517;
		
		System.out.println(mittelwertBerechnen(zahl1));
		System.out.println(mittelwertBerechnen(zahl2, zahl3));
		System.out.println(mittelwertBerechnen(zahl1, zahl2, zahl3));
		System.out.println(mittelwertBerechnen(zahl1, zahl2, zahl3, zahl4));
		
		int[] parameter = new int[1];
		parameter[0] = zahl1;
		
		parameter = new int[4];
		parameter[0] = zahl1;
		parameter[1] = zahl2;
		parameter[2] = zahl3;
		parameter[3] = zahl4;
		System.out.println(mittelwertBerechnen(parameter));
		int[] nochEinVersuch = {1,4,8,13,55,44,12,56};
		System.out.println(mittelwertBerechnen(nochEinVersuch));
		//Wunsch:
		System.out.println(mittelwertBerechnen(2,15,55,116,33,4,123,99,1, -30));
		
		begruessen(true,"Elisabeth", "Alexandra","Mary","Wilhelmina","Windsor");
	}
	/**
	 * Demosntriert vararg 
	 * @param weiblich
	 * @param namen
	 */
	public static void begruessen(boolean weiblich, String... namen) {
		if(weiblich) {
			System.out.println("Willkommen Frau " + namen[namen.length-2]);
		}else {
			System.out.println("Willkommen Herr " + namen[namen.length-1]);
		}
		
	}
	
	public static double mittelwertBerechnen(int... zahlen) {
		int summe = 0;
		for(int i =0; i < zahlen.length; i++) {
			summe = summe + zahlen[i];
		}
		double rueckgabe = summe/(double)zahlen.length; 
		return rueckgabe;
	} 
	
//	public static double mittelwertBerechnen(int[] zahlen) {
//		int summe =0;
//		for(int i =0; i< zahlen.length; i++) {
//			summe = summe + zahlen[i];
//		}
//		double rueckgabe = summe/(double)zahlen.length;
//		return rueckgabe;
//	}
//	
//	public static double mittelwertBerechnen(int zahl) {
//		return zahl;
//	}
//	
//	public static double mittelwertBerechnen(int zahl1, int zah2) {
//		double rueckgabe = (zahl1 + zah2) / (double)2;
//		return rueckgabe; 
//	}
//	
//	public static double mittelwertBerechnen(int zahl1, int zahl2, int zahl3) {
//		double rueckgabe = (zahl1 + zahl2 + zahl3) / (double)3;
//		return rueckgabe;
//	}
//	
//	public static double mittelwertBerechnen(int zahl1, int zahl2, int zahl3, int zahl4) {
//		double rueckgabe = (zahl1 + zahl2 + zahl3 + zahl4) / (double)4;
//		return rueckgabe;
//	}
	
}
