package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	private String message, topic;
	
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message=message;
	}
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public PublishMsg(String msg) {
		this.message=msg;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String msg) {
		this.message = msg;
	}
	@Override
	public String toString() {
		return "Message [type=\" + super.getType() + \", user=\" + super.getUser() + \", topic=\" + getTopic() + \"] ";
	};
	
	
}
