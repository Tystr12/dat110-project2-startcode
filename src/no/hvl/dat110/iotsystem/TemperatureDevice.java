package no.hvl.dat110.iotsystem;


import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();
		String topic = Common.TEMPTOPIC;
		
		// TODO - start

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker
		
		Client tempDevice = new Client("tempDevice", Common.BROKERHOST, Common.BROKERPORT);
		tempDevice.connect();
		
		// tempDevice.createTopic(topic) this broke the code, not sure why, dont use this again...
		
		for(int i = 0; i < COUNT; i++) {
			tempDevice.publish(topic, String.valueOf(sn.read()));
		}
		tempDevice.disconnect();

		// TODO - end

		System.out.println("Temperature device stopping ... ");

	}
}
