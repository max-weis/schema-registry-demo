package de.maxweis.ba.profile.control;

import de.maxweis.ba.profile.entity.Profile;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProfileRepository {

    @Inject
    EntityManager em;

    public List<Profile> list() {
        return this.em.createQuery("select id, firstName, lastName, email, gender, image from profile", Profile.class).getResultList();
    }

    @Transactional
    public Long save(final Profile profile) {
        this.em.persist(profile);
        return profile.getId();
    }

}
