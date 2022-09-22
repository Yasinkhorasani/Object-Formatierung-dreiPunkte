package de.bikeshop.wuensche;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Anzeige des Datums nach Ort
 * Mehrfachverzweigung mit switch-case
 * @author Alfa
 *
 */
public class BondZeigtHeute {

	public static void main(String[] args) {
		String ort;
		if(args.length > 0) {
			ort = args[0];
		}else {
			ort = "Deutsch";
		}
		
		Locale zuhause;
		
		switch(ort) {
		case "Deutsch":
			System.out.println("Sprache deutsch wurde gewählt");
			zuhause = Locale.GERMAN;
			break;
		case "English":
			System.out.println("English was choosen");
			zuhause = Locale.ENGLISH;
			break;
		case "French":
		case "french":
			System.out.println("je ne parle pas fra... ");
		case "Franzöisch":
			System.out.println("Französisch...");
			zuhause = Locale.FRENCH;
			break;
		case "Persisch":
			System.out.println("Farsi entekhab shod");
			zuhause = Locale.JAPANESE;
			break;
		case "Türkisch":
			System.out.println("Türkce secildi.");
			zuhause = Locale.TAIWAN;
			break;
		case "Gujarati":
			System.out.println("Gujarati ");
			zuhause = Locale.ITALIAN;
			break;
		default: 
			System.out.println("Gewählte Sprache unbekannt");
			zuhause = Locale.getDefault();
			break;
		}
		
		LocalDate heute = LocalDate.now();
//		DateTimeFormatter wunschFormatierer = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(zuhause);
//		DateTimeFormatter wunschFormatierer = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(zuhause);
//		DateTimeFormatter wunschFormatierer = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(zuhause);
		DateTimeFormatter wunschFormatierer = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(zuhause);
		
		String datumsAnzeige = heute.format(wunschFormatierer);
		System.out.println(datumsAnzeige);
		System.out.println(heute);
		leseTesten();
	}

	public static void leseTesten() {
		Scanner leser = new Scanner(System.in);
		boolean kannLesen;
		do {
			System.out.println("Gib Donnerstag ein");
			String eingabe = leser.nextLine();
			kannLesen = eingabe.equals("Donnerstag");
		}while(!kannLesen);
		System.out.println("Lesetest abgeschlossen: Du warst erfolgreich");
	}
}
