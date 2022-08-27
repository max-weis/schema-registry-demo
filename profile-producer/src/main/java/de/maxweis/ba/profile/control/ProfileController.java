package de.maxweis.ba.profile.control;

import de.maxweis.ba.profile.boundary.ProfileEventProducer;
import de.maxweis.ba.profile.entity.Profile;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ProfileController {

    private static final Logger LOG = Logger.getLogger(ProfileController.class);

    @Inject
    ProfileEventProducer producer;

    @Inject
    ProfileRepository repository;

    public Long saveProfile(final Profile profile) {
        Long id = this.repository.save(profile);

        LOG.info(profile);

        this.producer.send(profile);

        return id;
    }

}
