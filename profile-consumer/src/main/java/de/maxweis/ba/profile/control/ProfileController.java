package de.maxweis.ba.profile.control;

import de.maxweis.ba.profile.entity.Profile;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ProfileController {

    private static final Logger LOG = Logger.getLogger(ProfileController.class);

    @Inject
    ProfileRepository repository;

    public List<Profile> findAll() {
        List<Profile> list = this.repository.list();

        LOG.infof("found %d profiles", list.size());

        return list;
    }

    public void save(final Profile profile) {
        Long id = this.repository.save(profile);

        LOG.infof("saved profile: %d", id);
    }


}
