import java.util.ArrayList;

public class Treffer implements Comparable {

	public int erzieltePunkt;
	public static ArrayList<Integer> punkteArray = new ArrayList<>();

	/**
	 * Constructor, füllt ArrayList mit Gültigen Werten,
	 * und setz den Punktwert
	 * @param _erzieltePunkt
	 */
	public Treffer(int _erzieltePunkt) {
		//this.erzieltePunkt = _erzieltePunkt;
		fuelleArrayList();
		setzeDenPunkt(_erzieltePunkt);
	}

	/**
	 * Diese Methode untersucht ob der gegebenen Punkt vorgesehen ist,
	 * wenn ja dann setzt IV erzieltePunkt ein 
	 * wenn nicht dann setzt 50 für den IV 
	 * @param punkt
	 */
	public void setzeDenPunkt (int punkt)
	{
		if(punkteArray.contains(Integer.valueOf(punkt)))
		{
			this.erzieltePunkt=punkt;
		}
		else 
		{
			this.erzieltePunkt=50;
		}
			
		
	}

	/**
	 * 
	 */
	public void fuelleArrayList() {
		punkteArray.add(50);
		punkteArray.add(100);
		punkteArray.add(200);
		punkteArray.add(500);
		punkteArray.add(750);
		punkteArray.add(1000);

	}
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
