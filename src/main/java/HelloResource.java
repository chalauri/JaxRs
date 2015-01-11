package main.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



public class HelloResource {
	
	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String sayHello(){
		
		return "Hello, I am Giga";
	}

}
