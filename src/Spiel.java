import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

// Aufgabe 2A
/**
 * Diese Klasse setzt den Ablauf und die Logik des Spiels um.
 * 
 * @author serefbolat
 *
 */
public class Spiel {

	// Aufgabe 1A - Hier ist sinnvoll gültige Punkte als Key und Anzahl der Treffer
	// als Value zu speichern.
	// Deswegen beide Werte sind Integer.
	// ?? initialisieren hier oder im Constructor sinnvoll ??
	private TreeMap<Integer, Integer> schaden;

	/**
	 * Constructor initialisiert den TreeMap
	 */
	public Spiel() 
	{
		 schaden = new TreeMap<>();
	}
	
	/**
	 * Main Methode
	 * @param args
	 */
	public static void main(String[] args) {
		// Treffer t1=new Treffer(5);
		// t1.fuelleArrayList();
		
		// Aufgabe 3C
		Spiel spiel = new Spiel();
		spiel.testeTreffer();
		System.out.println("************ Aufgabe 3C **********");
		System.out.println(spiel.trefferBericht());

		spiel.score();

		System.out.println("************ Aufgabe 4b **********");
		// Aufgabe 4B - Methoden aufruf mit einem Parameter des korrekten Typs
		// weil schaden Map random ausgefüllt ist kann manchmal null werte eintreten.
		spiel.testExceptions(1000);

		// Aufgabe 4C1
		// Methoden aufruf mit einem Parameter des falschen Typs
		// Fehler Meldung: Exception in thread "main" java.lang.ClassCastException:
		// class java.lang.Integer cannot be cast to class java.lang.String
		// Unchecked Exception
		System.out.println("************ Aufgabe 4C1 **********");
		//spiel.testExceptions("test mit falcschen Typ");

		// Aufgabe 4C2
		// Methoden aufruf mit null als Parameter
		// Fehler Meldung: Exception in thread "main" java.lang.NullPointerException
		// Unchecked Exception
		System.out.println("************ Aufgabe 4C2 **********");
		// spiel.testExceptions(null);

		System.out.println("************ Aufgabe 5B-Korrekten Aufruf  **********");
		// Aufgabe 5B Testen von Ausnahmebehandlung
		// Korrekten aufruf
		//spiel.catchExeptions(100);

		System.out.println("************ Aufgabe 5B-Aufruf mit Null Werte  **********");
		// Aufruf mit null
		//spiel.catchExeptions(null);
		
		System.out.println("************ Aufgabe 5B-Aufruf mit String Werte  **********");
		// Aufruf mit falschen Typ Parameter 
		//spiel.catchExeptions("test");
		
		System.out.println("************ Aufgabe 5H  **********");
		
		try {
			spiel.throwExceptions(1000);
		} 
		catch (NullPointerException e){
			System.err.println("Null Pointer Exception ist aufgetreten.");
		}
		catch (ClassCastException e) {
			System.err.println("Class Cast Exception ist aufgetreten.");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Allgemeinen catch block.");
		}

	}

	// Aufgabe 2B
	/**
	 * Mit hilfe dieser Methode ein Treffer im Spiel registriert. Wenn ein Eintrag
	 * schon gibt dann zunächst ermittle aktuelle Anzahl in der Map zu diesem
	 * treffer und dann aktualiesiere den Map. wenn kein Eintrag in den Map gibt
	 * dann füge einen neuen Eintrag hinzu
	 * 
	 * @param t
	 */
	public void registrieren(Treffer t) {
		if (schaden.containsKey(t.erzieltePunkt)) {
			// get Methode bekommt Key als Parameter und gibt dazugehörige Value zurück
			int aktuelleAnzahl = schaden.get(t.erzieltePunkt).intValue();
			aktuelleAnzahl++; // ein erhöht
			schaden.put(t.erzieltePunkt, aktuelleAnzahl); // aktualiesiert 

		} else {
			schaden.put(t.erzieltePunkt, 1);
		}

	}

	// Aufgabe 2C version 1
	/**
	 * 
	 */

	/*
	 * public void testeTreffer() {
	 * 
	 * Treffer t1=new Treffer(Treffer.punkteArray.get(0)); Treffer t2=new
	 * Treffer(Treffer.punkteArray.get(1)); Treffer t3=new
	 * Treffer(Treffer.punkteArray.get(2)); Treffer t4=new
	 * Treffer(Treffer.punkteArray.get(3)); Treffer t5=new
	 * Treffer(Treffer.punkteArray.get(4)); Treffer t6=new
	 * Treffer(Treffer.punkteArray.get(5));
	 * 
	 * Treffer t7=new Treffer(Treffer.punkteArray.get(0)); Treffer t8=new
	 * Treffer(Treffer.punkteArray.get(1)); Treffer t9=new
	 * Treffer(Treffer.punkteArray.get(2)); Treffer t10=new
	 * Treffer(Treffer.punkteArray.get(3)); Treffer t11=new
	 * Treffer(Treffer.punkteArray.get(4)); Treffer t12=new
	 * Treffer(Treffer.punkteArray.get(5)); Treffer t13=new
	 * Treffer(Treffer.punkteArray.get(0));
	 * 
	 * Treffer t14=new Treffer(Treffer.punkteArray.get(15)); Treffer t15=new
	 * Treffer(Treffer.punkteArray.get(125));
	 * 
	 * this.registieren(t1); this.registieren(t2); this.registieren(t3);
	 * this.registieren(t4); this.registieren(t5); this.registieren(t6);
	 * this.registieren(t7); this.registieren(t8); this.registieren(t9);
	 * this.registieren(t10); this.registieren(t11); this.registieren(t12);
	 * this.registieren(t13); this.registieren(t14); this.registieren(t15);
	 * 
	 * }
	 */
	
	
	
	
	
	// Aufgabe 2C
	/**
	 * Erzeugt ein Random Nummer bis size von Treffer.gueltigePunktzahlenArray,
	 * und dann registriert 
	 * 
	 */
	public void testeTreffer() {

		for (int counter = 0; counter < 13; counter++) {
			Random random = new Random();
			int randomNumber = random.nextInt(Treffer.gueltigePunktzahlenArray.length);
			this.registrieren(new Treffer(Treffer.gueltigePunktzahlenArray[randomNumber].intValue()));
			// System.out.println(randomNumber);
			// System.out.println(Treffer.punkteArray.get(randomNumber));

		}

		Treffer t1 = new Treffer(35);
		Treffer t2 = new Treffer(45);

		this.registrieren(t1);
		this.registrieren(t2);

	}

	// Aufgabe 3A
	// https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
	// Mann kann nicht über eine Map iterieren weil Map nicht Iterable Interface
	// implementiert hat.

	// Aufgabe 3B
	// - In welcher Reihenfolge ist dieses Set sortiert?
	// Nach dem Key Werte sortiert

	// - Kann man über einen Set iterieren? Woran erkennt man das?
	// https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
	// SET ist in Java API Iterable definiert, deswegen kann man über einen Set
	// iterieren

	/**
	 * Diese Methode iteriert über den Map und gibt Key und Anzahl von Value Werte als 
	 * rückgabe Wert zurück.
	 * @return Die gewünschte treffer Bericht als String.
	 */
	public String trefferBericht() {
		String bericht = "";
		for (Map.Entry<Integer, Integer> entry : schaden.entrySet()) {
			// bericht+=entry.getKey() + "/" + entry.getValue();
			System.out.println(entry.getKey() + "/" + entry.getValue());

		}
		return bericht;
	}

	// Aufgabe 4A
	/**
	 * Diese Methode bekommt ein key und dann holt den dazugehörigen Value aus der Map schaden 
	 * und gibt das Ergebnis auf die Konsole aus. 
	 * @param key 
	 */
	public void testExceptions(Object key) {

		System.out.println(schaden.get(key));
		System.out.println("###Fertig");
	}

	// Aufgabe 5A
	/**
	 * Modifizierte version von testExceptions Methode. Try-catch Blöcke sind verwendet.
	 * 
	 * @param key
	 */
	public void catchExeptions(Object key) {
		try {
			System.out.println(schaden.get(key));
			System.out.println("Kein Fehler/Try Block");

		}
		catch (NullPointerException e) { 
			System.err.println("Null Pointer Exception ist aufgetreten.");
		} catch (ClassCastException e) {
			System.err.println("Class Cast Exception ist aufgetreten.");
		}
		// Aufgabe 5C-D allgemeinen catch-Block am Ende funktioniert aber am Anfang
		// erlaubt der Compiler nicht weil hier ein Hierarchie gibt.
		// Unreachable catch block for NullPointerException. It is already handled by
		// the catch block for Exception
		catch (Exception e) {
			System.err.println("Allgemeinen catch block.");
		}
		// Aufgabe 5E - Funktioniert in jedem Fall, egal ob einen Fehler aufgetreten ist oder nicht.
		finally {
			System.err.println("Finally Block: Testen ist beendet.");
		}
	}

	// Aufgabe 5H
	/**
	 * 
	 * @param key
	 * @throws Exception
	 */
	public void throwExceptions(Object key) throws Exception {
		try {
			System.out.println(schaden.get(key));
			System.out.println("Kein Fehler/Try Block");

		}

		catch (NullPointerException e) {
			throw new NullPointerException();
		} catch (ClassCastException e) {
			System.err.println("Class Cast Exception ist aufgetreten.");
			throw new ClassCastException();
		}
		// Aufgabe 5C-D allgemeinen catch-Block am Ende funktioniert aber am Anfang
		// erlaubt der Compiler nicht weil hier ein Hierarchie gibt
		// Unreachable catch block for NullPointerException. It is already handled by
		// the catch block for Exception
		catch (Exception e) {
			System.err.println("Allgemeinen catch block.");
		}
		// Aufgabe 5E
		finally {
			System.err.println("Testen ist beendet.");
		}
	}

	// Aufgabe 6
	/**
	 * Wenn ein Treffer größer als 100 ist beschreiben wir den als Guter Treffer
	 * @param punkt
	 * @return
	 */
	public boolean istGuterTreffer(Integer punkt) {
		return punkt > 100;
	}

	public void score() {
		int guterTrefferCounter = 0;
		int score = 0;
		for (Entry<Integer, Integer> entry : schaden.entrySet()) {
			if (istGuterTreffer(entry.getKey())) {
				guterTrefferCounter += entry.getValue();
			}
		}
		System.out.println(guterTrefferCounter);
		score = guterTrefferCounter * 11 + (15 - guterTrefferCounter) * 3;
		System.out.println("Score= " + score);
	}
}
