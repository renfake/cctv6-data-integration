package com.cctv6.data.pipeline;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Gateway;

public interface OceanWebServiceRequest {
	
	@Gateway(requestChannel = "oceanWsRequestChannel")
	void request(Message<String> request);
}
