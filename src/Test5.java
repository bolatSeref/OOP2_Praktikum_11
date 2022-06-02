
public class Test5 {
	
	public static void main (String [] args) {
		Treffer t=new Treffer(34);
		Treffer t1=new Treffer(100);
		Treffer t2=new Treffer(50);
		Treffer t3=new Treffer(100);
		Treffer t4=new Treffer(100);


		
		Spiel spiel=new Spiel();
		spiel.testeTrefferVersion2();
		
		System.out.println(spiel.trefferBericht());
		
	}
}
