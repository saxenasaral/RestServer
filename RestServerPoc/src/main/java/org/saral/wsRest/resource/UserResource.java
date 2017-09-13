package org.saral.wsRest.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.saral.wsRest.bean.User;
import org.saral.wsRest.service.UserService;

@Path("/user")
public class UserResource {

	UserService userService = new UserService();

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("id") String id) {

		return userService.createUser();
	}

	@POST
	// @Path("{user}")
	@Consumes({ MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User createUser(User user) {

		return userService.createUser(user);

	}

	@GET
	@Path("/demo")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDemo() {
		return "demo";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@QueryParam("id") int id) {
		User user1 = new User();
		User user= userService.createUser();
		if(user.getId()== id){
			return user;
		}
		else{
			return user1;
		}
		
		
	}
	
	@GET
	@Path("/matrix")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserByIdMatrix(@MatrixParam("id01") int id) {
		User user1 = new User();
		User user= userService.createUser();
		if(user.getId()== id){
			return user;
		}
		else{
			return user1;
		}
		
		
	}


	static int checkPower(int n) {
		if(n%2 != 0){
			return -1;
		}
		int count=0;
		 do{
			
			n = n/2;
			count++;
			if(n%2 != 0){
				return -1;
			}
		}while (n%2==0);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 35;
		System.out.println(checkPower(x));
		

	}

}
