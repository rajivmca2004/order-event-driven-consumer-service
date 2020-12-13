package com.online.store.demo.ordereventdriven.stream;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
public class OrderEventConsumer {
	@StreamListener(OrderEventStream.INBOUND)
	public void consumeEvent(@Payload Message msg) {
		System.out.println("Inbound message--> id: " + msg.getId() + " Actual message: "
				+ msg.getData() + " bytePayload: " + msg.getBytePayload());
	}

}