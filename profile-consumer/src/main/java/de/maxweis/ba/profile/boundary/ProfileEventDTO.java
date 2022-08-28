package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.entity.Profile;

public class ProfileEventDTO {

    public String id;

    public String firstName;

    public String lastName;

    public String email;

    public String gender;

    public String image;

    public Profile toEntity() {
        return Profile.ProfileBuilder.aProfile()
                .withId(this.id)
                .withFirstName(this.firstName)
                .withLastName(this.lastName)
                .withEmail(this.email)
                .withGender(this.gender)
                .withImage(this.image)
                .build();
    }
}
