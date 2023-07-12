package gof.patterns.creational.singleton;

/*
 * Since java 1.5 using enum, singleton can be created
 * It handled serializaton using java's in-built mechanism 
 * and still ensures a single instance
 */
public enum RegistryEnum {

	INSTANCE;
	
	public void getConfiguration() {
		
	}
}
