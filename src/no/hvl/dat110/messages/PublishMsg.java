package no.hvl.dat110.messages;


public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	private String topic;
	private String message;
	
	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
		
	}
	
	public String getMessage() {
		// Usikker om det er slik dette skal gjøres spør i lab timen. ????
		return this.message;
		
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "PublishMsg [topic=" + topic + ", message=" + message + ", toString()=" + super.toString() + "]";
	}
	
	
}
