package de.maxweis.ba.profile.control;

import de.maxweis.ba.profile.entity.Profile;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class ProfileController {
    private static final Logger LOG = Logger.getLogger(ProfileController.class);

    private final Map<String, Profile> cache;

    public ProfileController() {
        this.cache = new HashMap<>();
    }

    public void save(final Profile profile) {
        LOG.infof("saved profile: %s", profile);
        this.cache.put(profile.getId(), profile);
    }

    public Profile findByID(final String id) {
        return this.cache.get(id);
    }
}
