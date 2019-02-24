package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	private String msg;
	
	
	public PublishMsg() {
		
	}
	
	public PublishMsg(String msg) {
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg;
	}
	
	public void setMessage(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Message ";
	};
	
	
}
