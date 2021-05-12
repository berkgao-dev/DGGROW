package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import service.DemoService;

@RestController
public class DemoController {
 
    @Autowired
    private DemoService demoService;
 
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }
 
    @RequestMapping(value = "/welcome/{userName}", method = RequestMethod.GET)
    public String welcome(
            @PathVariable("userName") String userName
    ) 
    {
        return demoService.welcome(userName);
    }
}