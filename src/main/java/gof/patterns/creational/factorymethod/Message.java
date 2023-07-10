package gof.patterns.creational.factorymethod;

public abstract class Message {

	/**
	 * This class represents interface for our "product" which is a message
	 * Implementations will be specific to content type.
	 *
	 */
	public abstract String getContent();

	public void addDefaultHeaders() {
		// Adds some default headers
	}

	public void encrypt() {
		// # Has some code to encrypt the content
	}

}
