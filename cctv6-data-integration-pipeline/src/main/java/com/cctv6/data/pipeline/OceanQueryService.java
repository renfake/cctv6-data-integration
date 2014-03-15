package com.cctv6.data.pipeline;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Gateway;

public interface OceanQueryService {

	@Gateway(requestChannel = "oceanQueryServiceRequestChannel")
	void request(Message<String> request);
}
