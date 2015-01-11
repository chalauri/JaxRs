package configuration;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import main.java.HelloResource;

@ApplicationPath("/resources")
public class Config extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public Config() {
		singletons.add(new HelloResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
