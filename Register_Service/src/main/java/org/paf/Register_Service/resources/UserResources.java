package org.paf.Register_Service.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/massage")
public class UserResources {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getmassages() {
		return "hello";
	}
}
