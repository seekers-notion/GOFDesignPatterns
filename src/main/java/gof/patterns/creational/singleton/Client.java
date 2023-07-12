package gof.patterns.creational.singleton;

public class Client {

	public static void main(String[] args) {

		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		System.out.println(registry == registry2);

		LazyRegistryWithDCL lazy = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazy2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazy == lazy2);

		LazyRegistryIODH iodh = LazyRegistryIODH.getInstance();
		LazyRegistryIODH iodh2 = LazyRegistryIODH.getInstance();
		System.out.println(iodh == iodh2);
		
		RegistryEnum enum1 = RegistryEnum.INSTANCE;
		RegistryEnum enum2 = RegistryEnum.INSTANCE;
		System.out.println(enum1 == enum2);
		
	}
}
