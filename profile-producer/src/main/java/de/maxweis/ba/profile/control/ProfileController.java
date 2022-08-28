package de.maxweis.ba.profile.control;

import de.maxweis.ba.profile.boundary.ProfileEventProducer;
import de.maxweis.ba.profile.entity.Profile;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class ProfileController {

    private static final Logger LOG = Logger.getLogger(ProfileController.class);

    @Inject
    ProfileEventProducer producer;

    public String saveProfile(final Profile profile) {
        UUID uuid = UUID.randomUUID();
        profile.setId(uuid.toString());

        LOG.info(profile);
        this.producer.send(profile);

        return profile.getId();
    }
}
