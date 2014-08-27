package my.note.app.web;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ContactControllerTest {

	@Autowired
	ContactController contactController;
	
	@Test
	public void listContactsTest(){
		
		   Map<String, Object> map = new HashMap<String, Object>();
	       Assert.assertEquals("contact", contactController.listContacts(map));
	}
	
/*	@Test
	public void testHelloController() {
	       HelloController c= new HelloController();
	       ModelAndView mav= c.handleRequest();
	       Assert.assertEquals("hello", mav.getViewName());
	       ...
	   }*/
	
}
