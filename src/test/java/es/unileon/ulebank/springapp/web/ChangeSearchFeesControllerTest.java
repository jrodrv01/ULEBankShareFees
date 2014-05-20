package es.unileon.ulebank.springapp.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.ulebank.springapp.web.ChangeSearchFeesController;


public class ChangeSearchFeesControllerTest {

	

	    @Test
	    public void testHandleRequestView() throws Exception{		
	        ChangeSearchFeesController controller = new ChangeSearchFeesController();
	        ModelAndView modelAndView = controller.handleRequest(null, null);		
	        assertEquals("hello.jsp", modelAndView.getViewName());
	    }

	
}
