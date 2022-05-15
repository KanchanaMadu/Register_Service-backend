package org.paf.Register_Service.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.paf.Register_Service.Model.User;
import org.paf.Register_Service.service.UserService;

@Path("/user_service")
public class UserController {
	
	UserService userService = new UserService();
	
	@GET
	@Path("/get_all_users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers() {
		
				return userService.getAllUsers();
	}
	
		
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id")int id ) {
		User user = userService.getUser(id);
		if (user!=null) {
			return Response.status(Response.Status.OK).entity(user).build();
			
		} else {
			return Response.status(Response.Status.NOT_FOUND).entity("User not Found").build();		

		}
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteUser(@PathParam("id")int id ) {
		return userService.deletUser(id);
		
	}
	
	@POST
	@Path("/add_user")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addUser(User user) {
		System.out.println(user);
		return userService.addUser(user);
	}	
	
		
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUser(@PathParam("id")int id ,User user) {
		user.setId(id);
		return userService.updateUser(user);
	}
}
