package gof.patterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserUpgradedDTO {

	private String name;

	private String address;

	private String age;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address;
	}

	// Get builder instance
	public static UserUpgradedDTOBuilder getBuilder() {
		return new UserUpgradedDTOBuilder();
	}

	// Builder
	public static class UserUpgradedDTOBuilder {

		private String firstName;

		private String lastName;

		private String age;

		private String address;

		private UserUpgradedDTO userUpgradedDTO;

		public UserUpgradedDTOBuilder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		public UserUpgradedDTOBuilder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		public UserUpgradedDTOBuilder withBirthday(LocalDate date) {
			age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
			return this;
		}

		public UserUpgradedDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber() + " " + address.getStreet() + "\n" + address.getCity() + ", "
					+ address.getState() + " " + address.getZipcode();

			return this;
		}

		public UserUpgradedDTO build() {
			this.userUpgradedDTO = new UserUpgradedDTO();
			userUpgradedDTO.setName(firstName + " " + lastName);
			userUpgradedDTO.setAddress(address);
			userUpgradedDTO.setAge(age);
			return this.userUpgradedDTO;
		}

		public UserUpgradedDTO getUserDTO() {
			return this.userUpgradedDTO;
		}
	}

}
