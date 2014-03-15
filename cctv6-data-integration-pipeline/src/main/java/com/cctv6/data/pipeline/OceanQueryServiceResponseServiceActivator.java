package com.cctv6.data.pipeline;

import org.apache.log4j.Logger;
import org.springframework.integration.Message;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class OceanQueryServiceResponseServiceActivator {
	
	private static final Logger logger = Logger.getLogger(OceanQueryServiceResponseServiceActivator.class);

	@ServiceActivator
	public void process(Message<String> msg) {
		String payload = msg.getPayload();
		logger.info("------->" + payload);
		//TODO: parse soap response following corresponding tables
	}
}
