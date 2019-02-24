package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	private String Topic;
	
	public SubscribeMsg(String user, String topic, String message) {
	super(MessageType.SUBSCRIBE, user);
	
	}
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method

}
