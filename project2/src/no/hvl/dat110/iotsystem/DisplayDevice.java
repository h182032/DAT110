package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
		
		Client client = new Client("displayDevice", Common.BROKERHOST, Common.BROKERPORT);

        client.connect();

        //Create and subscribe to topic
        client.createTopic(Common.TEMPTOPIC);
        client.subscribe(Common.TEMPTOPIC);

        System.out.println("Display Device");
        for (int i = 0; i < COUNT; i++) {
            try {
                PublishMsg msg = (PublishMsg) client.receive();
                System.out.println(msg.getMessage());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        client.disconnect();
				
		// TODO - END
		
		System.out.println("Display stopping ... ");

		
	}
}
