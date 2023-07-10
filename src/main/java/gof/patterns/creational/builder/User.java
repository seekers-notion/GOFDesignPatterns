package gof.patterns.creational.builder;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {

	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private Address address;

}
