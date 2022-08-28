package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.control.ProfileController;
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
    public CompletionStage<Void> receive(final Message<ProfileEventDTO> profile) {
        this.controller.save(profile.getPayload().toEntity());
        return profile.ack();
    }
}
