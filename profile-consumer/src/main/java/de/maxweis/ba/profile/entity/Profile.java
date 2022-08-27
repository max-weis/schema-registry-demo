package de.maxweis.ba.profile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String gender;
    private String image;

    public Profile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static final class ProfileBuilder {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private String image;

        private ProfileBuilder() {
        }

        public static ProfileBuilder aProfile() {
            return new ProfileBuilder();
        }

        public ProfileBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public ProfileBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProfileBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProfileBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public ProfileBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public ProfileBuilder withImage(String image) {
            this.image = image;
            return this;
        }

        public Profile build() {
            Profile profile = new Profile();
            profile.setId(id);
            profile.setFirstName(firstName);
            profile.setLastName(lastName);
            profile.setEmail(email);
            profile.setGender(gender);
            profile.setImage(image);
            return profile;
        }
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
