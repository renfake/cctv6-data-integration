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
@ContextConfiguration(locations = "classpath*:META-INF/spring/pipeline/data-pipeline-criteria-getitemdetail.xml")
public class WebServiceHandlingTest {
	private static final Logger logger = Logger.getLogger(WebServiceHandlingTest.class);
	
	@Autowired
	private OceanGetItemDetail wsRequest;
	
	@Autowired
	private OceanQueryService queryService;

	@Test
	public void testGetItemDetailServiceCall() throws Exception {
		String requestXml = RequestFileReader.getRequestFromFile("/request.txt");
		Message<String> request = MessageBuilder.withPayload(requestXml).build();
		logger.info(request.getPayload());
		wsRequest.request(request);
		Thread.sleep(1000000);
	}
	
	@Test
	public void testQueryServiceCall() throws Exception {
		String requestXml = RequestFileReader.getRequestFromFile("/queryservicerequest.txt");
		Message<String> request = MessageBuilder.withPayload(requestXml).build();
		logger.info(request.getPayload());
		queryService.request(request);
		Thread.sleep(1000000);
	}
}
