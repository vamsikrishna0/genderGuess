package com.cloud.genderguesser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.cloud.genderguesser.service.GenderGuesserService;
import com.mashape.unirest.http.exceptions.UnirestException;

import io.swagger.annotations.ApiOperation;


@RestController
public class GenderGuesserController {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }

	   @ApiOperation(value = "getgender", nickname = "getgender")
	   @RequestMapping(value = "/getgender", method = RequestMethod.GET)
	   String getGender(@RequestParam String name) throws UnirestException  {
		   GenderGuesserService service = new GenderGuesserService();
		   service.getResponse(name);
	       return "Hello World !" + name;
	   }

}
