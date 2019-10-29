package com.auth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auth.client.Resource2Client;


@RestController
public class PrincipleRestController {

	Resource2Client oauthClient;

	public PrincipleRestController(Resource2Client oauthClient) {
		this.oauthClient = oauthClient;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/user")
    Principal principal(Principal principal) {
        return principal;
    }

	@RequestMapping(method = RequestMethod.GET, value = "/downstream")
	String downstream(Principal principal) {
		return oauthClient.callDownstream();
	}
}
