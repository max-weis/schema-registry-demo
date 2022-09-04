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
    Emitter<ProfileDTO> emitter;

    public ProfileEventProducer() {
    }

    public void send(final Profile profile) {
        ProfileDTO eventDTO = ProfileDTO.newBuilder()
                .setId(profile.getId())
                .setFirstName(profile.getFirstName())
                .setLastName(profile.getLastName())
                .setGender(profile.getGender())
                .setEmail(profile.getEmail())
                .setImage(profile.getEmail())
                .build();

        this.emitter.send(Message.of(eventDTO));
    }
}
