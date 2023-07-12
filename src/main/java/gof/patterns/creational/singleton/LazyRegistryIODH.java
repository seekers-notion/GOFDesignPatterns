package gof.patterns.creational.singleton;

public class LazyRegistryIODH {

	private LazyRegistryIODH() {
		System.out.println("LazyIODH constructor is invoked once.");
	}
	
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANCE; 
	}
	
}
