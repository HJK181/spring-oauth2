package com.auth.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.stereotype.Service;

@Service
public class Resource2Client {

	private final OAuth2RestOperations	restTemplate;

	@Autowired
	public Resource2Client(final OAuth2RestOperations restTemplate,
			final DiscoveryClient discoveryClient) {
		this.restTemplate = restTemplate;
	}

	public String callDownstream() {
		String getResp = restTemplate.getForObject("http://localhost:8086/reza", String.class);
		return getResp;
	}
}
