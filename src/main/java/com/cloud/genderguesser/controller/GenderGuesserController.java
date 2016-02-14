package com.cloud.genderguesser.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.cloud.genderguesser.domain.GenderResponse;
import com.cloud.genderguesser.service.GenderGuesserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mashape.unirest.http.exceptions.UnirestException;

import io.swagger.annotations.ApiOperation;


@RestController
public class GenderGuesserController {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }

	   @ApiOperation(value = "getgender", nickname = "getgender")
	   @RequestMapping(value = "/getgender", method = RequestMethod.GET)
	   GenderResponse getGender(@RequestParam String name) throws UnirestException, JsonParseException, JsonMappingException, IOException  {
		   GenderGuesserService service = new GenderGuesserService();
	       return service.getResponse(name);
	   }

}
