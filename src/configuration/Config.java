package configuration;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.Provider;

import main.java.HelloResource;

@ApplicationPath("/resources")
@Provider
public class Config extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public Config() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n CHEMI KAI");
		singletons.add(new HelloResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

}
