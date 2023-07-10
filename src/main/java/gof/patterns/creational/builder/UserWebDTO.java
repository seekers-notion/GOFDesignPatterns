package gof.patterns.creational.builder;

import lombok.Data;

//A product in builder pattern
@Data
public class UserWebDTO implements UserDTO {

	private String name;

	private String address;

	private String age;

	public UserWebDTO(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

}
