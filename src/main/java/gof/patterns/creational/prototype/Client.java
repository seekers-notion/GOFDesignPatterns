package gof.patterns.creational.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Swordsman s1 = new Swordsman();
		s1.move(new Point3D(-10, 0, 1), 20);
		s1.attack();
		System.out.println(s1);
		
		Swordsman s2 = (Swordsman) s1.clone();
		 System.out.println(s2 + " Position of cloned man");
		 
		 General g1 = new General();
		 g1.move(new Point3D(5, 0, -10), 10);
		 g1.boostMorale();
		 System.out.println(g1);
				 
		 General g2 = (General) g1.clone();
		 System.err.println(g2);
		 

	}

}
