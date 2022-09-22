package de.bikeshop.wuensche;

import java.time.LocalDate;
import java.util.Scanner;

import com.band.bike.Fahrrad;
import com.band.bike.Klingel;



/**
 * C:\Users\alfa\Desktop\workspace_sep\007_JamesBondErklaertDenRest\bin>java -cp .;C:\Users\alfa\Desktop\Libs\bond\bondsbikes.jar de.bikeshop.wuensche.Wunschfahr
radAuswahl Mountainbike Silber 15
Fahrrad [klingel=Klingel [material=Blech, hersteller=Klaus Klingelmacher, lautstaerke=3], farbe=Silber, typ=Mountainbike, groesse=15, herstellungsDatum=2022-0
9-21]
 * @author Alfa
 *
 */
public class WunschfahrradAuswahl {

	public static void main(String[] args) {
		Fahrrad wunschrad = null;
//		wunschrad = datenSammeln();
//		String[] beipiel = {"Citybike","Pink","12"};
//		wunschrad = datenAuswerten(beipiel);
		
		wunschrad = datenAuswerten(args);
		
		System.out.println(wunschrad);
	}

	public static Fahrrad datenAuswerten(String[] fahrradDaten) {
		Fahrrad rad = null;
		if(fahrradDaten.length > 2) {
			String typ = fahrradDaten[0];
			String farbe = fahrradDaten[1];
			String groesseAlsText = fahrradDaten[2];
			Scanner umwandler = new Scanner(groesseAlsText);
			
			int groesseAlsInt;
			if(umwandler.hasNextInt()) {
				groesseAlsInt= umwandler.nextInt();
			}else {
				groesseAlsInt = 1; 
			}
					
			LocalDate herstellung = LocalDate.now();
			rad = new Fahrrad(farbe, typ, groesseAlsInt, herstellung);
			rad.setKlingel(new Klingel());
		}
		
		return rad;
	}
	
	public static Fahrrad datenSammeln() {
		Fahrrad rad = null;
		Klingel klingel = null;
		System.out.println("Welchen Typ soll dein Fahrrad haben?");
		Scanner textLeser = new Scanner(System.in);
		String wahlTyp = textLeser.nextLine();
		System.out.println("Welche Farbe soll dein Fahrrad haben?");
		String wahlFarbe = textLeser.nextLine();
		System.out.println("Welche Größe soll das Fahrrad haben?");
		Scanner zahlenLeser = new Scanner(System.in);
		int wahlGroesse = zahlenLeser.nextInt();
//		int wahlTag = zahlenLeser.nextInt(); TODO: Datum einlesen
		LocalDate herstellungsDatum = LocalDate.now();
		System.out.println("ist die Standard-Klingel ok?");
		String standardKlingel = textLeser.nextLine();
		if(standardKlingel.equalsIgnoreCase("ja") || standardKlingel.equals("yes")) {
			klingel = new Klingel();
		}else {
			System.out.println("Andere Klingeln gibt es zur Zeit nicht");
			klingel = new Klingel();
			//Oder fragen....
		}
		rad = new Fahrrad(wahlFarbe, wahlTyp, wahlGroesse, herstellungsDatum);
		rad.setKlingel(klingel);
		return rad;
	}
}
