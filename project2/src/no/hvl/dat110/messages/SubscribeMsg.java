package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	private String topic;
	
	public SubscribeMsg(String user, String topic) {
	super(MessageType.SUBSCRIBE, user);
	this.topic=topic;
	}
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "SubscribeMsg [topic=" + topic + "]";
	}

}
