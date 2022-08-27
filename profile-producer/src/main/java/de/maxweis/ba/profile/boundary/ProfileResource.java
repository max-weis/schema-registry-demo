package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.control.ProfileController;
import de.maxweis.ba.profile.entity.Profile;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/profile")
public class ProfileResource {

    @Inject
    ProfileController controller;

    @POST
    @Produces(MediaType.WILDCARD)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveProfile(final ProfileBaseDTO profile) {
        Long id = this.controller.saveProfile(profile.toEntity());
        return Response.created(URI.create("/profile/" + id)).build();
    }
}