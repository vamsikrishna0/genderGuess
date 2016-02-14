package com.cloud.genderguesser.service;

import java.io.IOException;

import org.json.JSONObject;

import com.cloud.genderguesser.domain.GenderResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GenderGuesserService {

	public GenderResponse getResponse(String name) throws UnirestException, JsonParseException, JsonMappingException, IOException {

HttpResponse<JsonNode> response = Unirest.get("https://montanaflynn-gender-guesser.p.mashape.com/?name=" + name)
.header("X-Mashape-Key","SwnNz9MGm0mshWJ0ioMJ5t9bIIXmp1JVPufjsnkuMZriDiXucy")
.header("Accept","application/json").asJson(); 
System.out.print(response.getBody().toString());
JSONObject feedObject = new JSONObject(response.getBody().toString());
ObjectMapper objectMapper = new ObjectMapper();
objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

return objectMapper.readValue(feedObject.toString(), GenderResponse.class);
		
	}
}
