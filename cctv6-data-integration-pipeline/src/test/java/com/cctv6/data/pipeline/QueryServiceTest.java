package com.cctv6.data.pipeline;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.Message;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/pipeline/data-pipeline-criteria-queryservice.xml" })
public class QueryServiceTest {
	private static final Logger logger = Logger
			.getLogger(QueryServiceTest.class);

	@Autowired
	private OceanQueryService queryService;

	@Test
	public void testQueryServiceCall() throws Exception {
		String requestXml = RequestFileReader
				.getRequestFromFile("/queryservicerequest.txt");
		Message<String> request = MessageBuilder.withPayload(requestXml)
				.build();
		logger.info(request.getPayload());
		queryService.request(request);
		Thread.sleep(1000000);
	}
}
