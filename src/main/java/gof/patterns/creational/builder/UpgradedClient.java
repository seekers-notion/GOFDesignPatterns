package gof.patterns.creational.builder;

import java.time.LocalDate;

import gof.patterns.creational.builder.UserUpgradedDTO.UserUpgradedDTOBuilder;

public class UpgradedClient {

	public static void main(String[] args) {
		User user = createUser();
		// Client has to provide director with concrete builder
		UserUpgradedDTO dto = directBuild(UserUpgradedDTO.getBuilder(), user);
		System.out.println(dto);
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserUpgradedDTO directBuild(UserUpgradedDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
	}

	/**
	 * Returns a sample user.
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}

}
