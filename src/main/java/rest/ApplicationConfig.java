package rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        // Add resource classes
        resources.add(errorhandling.GenericExceptionMapper.class);
        resources.add(rest.PersonResource.class);
        // Return the set of classes
        return resources;
    }
}
