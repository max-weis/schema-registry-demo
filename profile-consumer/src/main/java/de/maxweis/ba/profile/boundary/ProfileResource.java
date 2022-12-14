package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.control.ProfileController;
import de.maxweis.ba.profile.entity.Profile;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/profile")
public class ProfileResource {

    @Inject
    ProfileController controller;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findByID(@PathParam("id") final String id) {
        Profile profile = this.controller.findByID(id);
        return Response.ok(profile).build();
    }
}
