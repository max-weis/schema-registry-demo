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
    Emitter<ProfileEventDTO> emitter;

    public ProfileEventProducer() {
    }

    public void send(final Profile profile) {
        ProfileEventDTO eventDTO = ProfileEventDTO.ProfileEventDTOBuilder.aProfileEventDTO()
                .withId(profile.getId())
                .withFirstName(profile.getFirstName())
                .withLastName(profile.getLastName())
                .withGender(profile.getGender())
                .withEmail(profile.getEmail())
                .withImage(profile.getEmail())
                .build();

        this.emitter.send(Message.of(eventDTO));
    }
}
