package main.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {
	
	@GET
	@Path("/sayHello")
	@Produces("text/plain")
	public String sayHello(){
		
		return "Hello, I am Giga";
	}

}
