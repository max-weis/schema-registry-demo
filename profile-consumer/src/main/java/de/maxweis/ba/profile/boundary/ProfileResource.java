package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.control.ProfileController;
import de.maxweis.ba.profile.entity.Profile;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/profile")
public class ProfileResource {

    @Inject
    ProfileController controller;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findProfiles() {
        List<Profile> profiles = this.controller.findAll();
        return Response.ok(profiles).build();
    }
}