package com.masterjavaonline.util;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestClass {

	public static void main(String[] args) {

		String id = "1";
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/RestFulCRUD/employee/getemp'" + id + "'");

			ClientResponse clientResponse = webResource.accept("application/json").get(ClientResponse.class);

			System.out.println("I am here ");
			System.out.println("Status from Server:" + clientResponse.getStatus());
			System.out.println("Response from Server:" + clientResponse.getEntity(String.class));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
