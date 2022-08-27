package de.maxweis.ba.profile.control;

import de.maxweis.ba.profile.entity.Profile;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class ProfileRepository {

    @Inject
    EntityManager em;

    @Transactional
    public Long save(final Profile profile) {
        this.em.persist(profile);

        return profile.getId();
    }

}
