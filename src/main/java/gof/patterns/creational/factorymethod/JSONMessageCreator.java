package gof.patterns.creational.factorymethod;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
