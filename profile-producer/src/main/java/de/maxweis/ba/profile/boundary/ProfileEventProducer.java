package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.entity.Profile;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Message;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ProfileEventProducer {
    @Inject
    @Channel("profile-out")
    Emitter<Profile> emitter;

    public ProfileEventProducer() {
    }

    public void send(final Profile profile) {
        this.emitter.send(Message.of(profile));
    }
}
