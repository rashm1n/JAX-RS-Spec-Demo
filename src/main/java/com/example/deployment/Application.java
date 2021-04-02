package com.example.deployment;

import com.example.service.BasicResource;
import com.example.service.SubResource1;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * JAXRS provides a deployment agnostic abstract class Application for declaring resources
 * Web service can extend this class to declare resources
 *
 * ResourceConfig is Jersey's implementation of Application class
 * Provides extra facilities to simplify the development
 * **/
public class Application extends ResourceConfig {
    public Application() {
        packages("com.example");
    }
}

/**
 * Application Class which extends the original
 * **/
class ApplicationOriginal extends javax.ws.rs.core.Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<>();
        s.add(BasicResource.class);
        s.add(SubResource1.class);
        return s;
    }
}
