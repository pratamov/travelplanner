package com.timkita.util;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.enterprise.context.Dependent;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

@Dependent
public class RestClientUtil {
	
	private static String API_KEY = "531bd696-5113-469c-8086-39073fe89517";
	private static String API_ENDPOINT = "https://terminal2.expedia.com";
	
	public static String getFeature(String value) throws KeyManagementException, NoSuchAlgorithmException {
		ApacheHttpClient4Engine engine = new ApacheHttpClient4Engine(ConnectionUtil.getUnsecureHttpClient());
		ResteasyClient client = new ResteasyClientBuilder().httpEngine(engine).build();
		ResteasyWebTarget target = client.target(API_ENDPOINT);
		Response response = target
				.queryParam("ln.op", "cn")
				.queryParam("type", "multi_city_vicinity")
				.queryParam("verbose", "2")
				.queryParam("limit", "1")
				.queryParam("ln.value", value)
				.request()
				.header("key", API_KEY)
				.get();
		String value_response = response.readEntity(String.class);
		response.close();
		return value_response;
	}
	
}
