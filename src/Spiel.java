import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
// Aufgabe 2A
/**
 * Diese Klasse setzt den Ablauf und die Logik des Spiels um.
 * @author serefbolat
 *
 */
public class Spiel {
	
	private TreeMap <Integer, Integer> punktMap=new TreeMap<>();
	
	
	
	
	// Aufgabe 2B
	/**
	 * Registriert den Treffer
	 * @param t
	 */
	public void registieren (Treffer t)
	{
		
		if(punktMap.containsKey(t.erzieltePunkt))// Wenn ein Eintrag schon gibt dann zunächst ermittle aktuelle Anzahl in der Map zu diesem treffer und dann aktualiesiere den Map
		{
			int aktuelleAnzahl=punktMap.get(t.erzieltePunkt).intValue();
			aktuelleAnzahl++;
			punktMap.put(t.erzieltePunkt, aktuelleAnzahl);
			
			//System.out.println(punktMap.get(t.erzieltePunkt).intValue());
		}
		else // wenn kein Eintrag in den Map gibt dann füge einen neuen Eintrag hinzu 
		{
			punktMap.put(t.erzieltePunkt, 1);
   		}

	}
	
	
	// Aufgabe 2C
	/**
	 * 
	 */
	public void testeTreffer() 
	{
		
		Treffer t1=new Treffer(Treffer.punkteArray.get(0));
		Treffer t2=new Treffer(Treffer.punkteArray.get(1));
		Treffer t3=new Treffer(Treffer.punkteArray.get(2));
		Treffer t4=new Treffer(Treffer.punkteArray.get(3));
		Treffer t5=new Treffer(Treffer.punkteArray.get(4));
		Treffer t6=new Treffer(Treffer.punkteArray.get(5));
		
		Treffer t7=new Treffer(Treffer.punkteArray.get(0));
		Treffer t8=new Treffer(Treffer.punkteArray.get(1));
		Treffer t9=new Treffer(Treffer.punkteArray.get(2));
		Treffer t10=new Treffer(Treffer.punkteArray.get(3));
		Treffer t11=new Treffer(Treffer.punkteArray.get(4));
		Treffer t12=new Treffer(Treffer.punkteArray.get(5));
		Treffer t13=new Treffer(Treffer.punkteArray.get(0));
		
		Treffer t14=new Treffer(Treffer.punkteArray.get(15));
		Treffer t15=new Treffer(Treffer.punkteArray.get(125));
		
		this.registieren(t1);
		this.registieren(t2);
		this.registieren(t3);
		this.registieren(t4);
		this.registieren(t5);
		this.registieren(t6);
		this.registieren(t7);
		this.registieren(t8);
		this.registieren(t9);
		this.registieren(t10);
		this.registieren(t11);
		this.registieren(t12);
		this.registieren(t13);
		this.registieren(t14);
		this.registieren(t15);

	}
	
	// Aufgabe 2C
		/**
		 * Erzeugt ein Random Nummer bis size von Treffer.punkteArray,
		 * 
		 */
		public void testeTrefferVersion2() 
		{
						
			int counter=0;
			for(; counter<13; counter++)
			{
				Random random=new Random();
				int randomNumber=random.nextInt(Treffer.punkteArray.size());
				this.registieren(new Treffer(Treffer.punkteArray.get(randomNumber)));
			//	System.out.println(randomNumber);
			//	System.out.println(Treffer.punkteArray.get(randomNumber));

			}
			
			Treffer t1=new Treffer(35);
			Treffer t2=new Treffer(45);
			
			this.registieren(t1);
			this.registieren(t2);
			
		//	System.out.println(punktMap.size());
			/*
			Treffer t1=new Treffer(Treffer.punkteArray.get(0));
			Treffer t2=new Treffer(Treffer.punkteArray.get(1));
			Treffer t3=new Treffer(Treffer.punkteArray.get(2));
			Treffer t4=new Treffer(Treffer.punkteArray.get(3));
			Treffer t5=new Treffer(Treffer.punkteArray.get(4));
			Treffer t6=new Treffer(Treffer.punkteArray.get(5));
			
			Treffer t7=new Treffer(Treffer.punkteArray.get(0));
			Treffer t8=new Treffer(Treffer.punkteArray.get(1));
			Treffer t9=new Treffer(Treffer.punkteArray.get(2));
			Treffer t10=new Treffer(Treffer.punkteArray.get(3));
			Treffer t11=new Treffer(Treffer.punkteArray.get(4));
			Treffer t12=new Treffer(Treffer.punkteArray.get(5));
			Treffer t13=new Treffer(Treffer.punkteArray.get(0));
			
			Treffer t14=new Treffer(Treffer.punkteArray.get(15));
			Treffer t15=new Treffer(Treffer.punkteArray.get(125));
			
			this.registieren(t1);
			this.registieren(t2);
			this.registieren(t3);
			this.registieren(t4);
			this.registieren(t5);
			this.registieren(t6);
			this.registieren(t7);
			this.registieren(t8);
			this.registieren(t9);
			this.registieren(t10);
			this.registieren(t11);
			this.registieren(t12);
			this.registieren(t13);
			this.registieren(t14);
			this.registieren(t15);

*/

		}
		
		// Aufgabe 3A
		// https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
		// Mann kann nicht über eine Map iterieren weil Map nicht Iterable Interface implemented hat.
		
		// Aufgabe 3B 
		
		public String trefferBericht() 
		{
			String bericht="";
			for (Entry<Integer, Integer> entry : punktMap.entrySet()) {
			 //   bericht+=entry.getKey() + "/" + entry.getValue();
			 System.out.println( entry.getKey() + "/" + entry.getValue());
 
			}
			return bericht;
		}
		
		
}

