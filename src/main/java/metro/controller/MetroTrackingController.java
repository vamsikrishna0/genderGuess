package metro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import io.swagger.annotations.ApiOperation;


@RestController
public class MetroTrackingController {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }

	   @ApiOperation(value = "getstatus", nickname = "getGoogleFeed")
	   @RequestMapping(value = "/getstatus", method = RequestMethod.GET)
	   String getStatus(@RequestParam String test)  {
	       return "Hello World !" + test;
	   }
}
