package com.cctv6.data.pipeline;

import org.apache.log4j.Logger;
import org.springframework.integration.Message;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * A service activator to handle ocean ws response
 * @author kris
 *
 */

@MessageEndpoint
public class OceanWebServiceResponseHandleServiceActivator {
	private static final Logger logger = Logger.getLogger(OceanWebServiceResponseHandleServiceActivator.class);

	@ServiceActivator
	public void process(Message<String> msg) {
		String payload = msg.getPayload();
		logger.info(payload);
	}
}
