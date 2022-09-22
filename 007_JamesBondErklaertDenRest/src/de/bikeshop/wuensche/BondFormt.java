package de.bikeshop.wuensche;

public class BondFormt {

	public static void main(String[] args) {
		String[] sorten = {"Tomate", "Kiwi", "Aubergine"};
		double[] preise = {1.99*1.19, 3, 22.5};
		int[] bestellnummern = {1, 20, 303};
		
		for(int i =0; i < 3; i++) {
			System.out.printf(
					"Sorte: %10s | Preis: %5.2f €  |  Bestellnummer: %3d | %n"
					,sorten[i]
					,preise[i]
					,bestellnummern[i]
					);
//			System.out.println(preise[i]);
		}
		System.out.println();
		System.out.printf("%10s | %7s  |  %s | %n"
				,"Sorte"
				,"Preis"
				,"Bestellnummer"
				);
		System.out.println("----------------------------------------");
		for(int i =0; i < 3; i++) {
			System.out.printf(
					"%10s | %5.2f €  |  %13d | %n"
					,sorten[i]
					,preise[i]
					,bestellnummern[i]
					);
//			System.out.println();
		}

	}

}
