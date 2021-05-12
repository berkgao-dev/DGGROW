package com.example.demo;




import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import controller.DemoController;
import service.DemoService;

@SpringBootTest
public class DemoApplicationTest {
	
	private DemoController demoController;
	 
    private DemoService demoService;

    @Before
    public void init(){
        demoService = mock(DemoService.class);
        demoController = new DemoController(demoService);
    }
	@Test
	 public void demoControllerShouldCallService() {
        String userName = "bgarcia";
        String expectedMessage = "message";
 
        when(demoService.welcome(userName)).thenReturn(expectedMessage);
 
        String message = demoController.welcome(userName);
 
        verify(demoService).welcome(userName);
        assertTrue(message.equals(expectedMessage));    
    }

}
