package com.cloud.genderguesser.service;

import com.cloud.genderguesser.domain.GenderResponse;
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GenderGuesserService {

	public String getResponse(String name) throws UnirestException {

HttpResponse<JsonNode> response = Unirest.get("https://montanaflynn-gender-guesser.p.mashape.com/?name=" + name)
.header("X-Mashape-Key","SwnNz9MGm0mshWJ0ioMJ5t9bIIXmp1JVPufjsnkuMZriDiXucy")
.header("Accept","application/json").asJson(); 
System.out.print(response.getBody().toString());
		return response.getBody().toString();
		
	}
}
