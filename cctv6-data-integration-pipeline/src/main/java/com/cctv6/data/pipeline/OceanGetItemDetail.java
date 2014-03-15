package com.cctv6.data.pipeline;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Gateway;

public interface OceanGetItemDetail {
	
	@Gateway(requestChannel = "oceanGetItemDetailRequestChannel")
	void request(Message<String> request);
}
