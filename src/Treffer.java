import java.util.ArrayList;
import java.util.Arrays;

// ???? mit oder ohne <> ??? public class Treffer implements Comparable <Integer> {

public class Treffer implements Comparable {

	public int erzieltePunkt;
	public static ArrayList<Integer> punkteArray = new ArrayList<>();
	// version2
	//Gültige Punktzahlen sind in einem Integer Array als Klassen-Variable definiert.
	public static Integer [] gueltigePunktzahlenArray = {50,100,200,500,750,1000};
	
	/**
	 * Constructor, füllt ArrayList mit Gültigen Werten,
	 * und setz den Punktwert
	 * @param _erzieltePunkt
	 */
	public Treffer(int _erzieltePunkt) {
		//this.erzieltePunkt = _erzieltePunkt;
		//fuelleArrayList();
		setzeDenPunktV2(_erzieltePunkt);
	}

	/**
	 * Diese Methode untersucht ob der gegebenen Punkt vorgesehen ist,
	 * wenn ja dann setzt IV erzieltePunkt ein 
	 * wenn nicht dann setzt 50 für den IV 
	 * @param punkt
	 */
//	public void setzeDenPunkt (int punkt)
//	{
//		if(punkteArray.contains(Integer.valueOf(punkt)))
//		{
//			this.erzieltePunkt=punkt;
//		}
//		else 
//		{
//			this.erzieltePunkt=50;
//		}
//			
//		
//	}
//	
	/**
	 * Zunächst kontrolliere ob die Zahl vorgesehene Zahlen gehört. Wenn ja 
	 * setze den IV, wenn nicht setze den Wert 50 zu IV erzieltePunkt.
	 * @param punkt
	 */
	public void setzeDenPunktV2 (int punkt)
	{
		if(Arrays.asList(gueltigePunktzahlenArray).contains(Integer.valueOf(punkt))) 
		{
			this.erzieltePunkt=punkt;
		}
		else // wenn die Zahl nicht zu vorgesehene Zahlen gehört
		{
			this.erzieltePunkt=50;
		}
			
		
	}

	/**
	 * 
	 */
	/*
	public void fuelleArrayList() {
		punkteArray.add(50);
		punkteArray.add(100);
		punkteArray.add(200);
		punkteArray.add(500);
		punkteArray.add(750);
		punkteArray.add(1000);

	}
	*/
//
//	@Override
//	public int compareTo(Integer o) {
//		// TODO Auto-generated method stub
//		Integer i=Integer.valueOf(erzieltePunkt);
//		return i.compareTo(o);
//	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
