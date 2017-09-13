package com.training.test;

import javax.ws.rs.core.Application;

import junit.framework.Assert;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import org.saral.wsRest.resource.UserResource;

public class WSTest extends JerseyTest {

	
    @Override
    protected Application configure() {
        return new ResourceConfig(UserResource.class);
    }
	
    @Test
    public void testGet(){
    	System.out.println("inside test");
    	String response = target("user/demo").request().get(String.class);
    	System.out.println(response);
    	Assert.assertEquals("demo", response);
    }
	
	public static void main(String [] args) {
		
		
	}
	
	
	
	
}
