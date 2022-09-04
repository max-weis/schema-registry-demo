package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.control.ProfileController;
import de.maxweis.ba.profile.entity.Profile;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

@ApplicationScoped
public class ProfileEventConsumer {

    @Inject
    ProfileController controller;

    public ProfileEventConsumer() {
    }

    @Incoming("profile-in")
    public CompletionStage<Void> receive(final Message<ProfileDTO> profile) {
        ProfileDTO payload = profile.getPayload();
        Profile prof = Profile.ProfileBuilder.aProfile()
                .withId(payload.getId())
                .withFirstName(payload.getFirstName())
                .withLastName(payload.getLastName())
                .withEmail(payload.getEmail())
                .withGender(payload.getGender())
                .withImage(payload.getImage())
                .build();

        this.controller.save(prof);
        return profile.ack();
    }
}
