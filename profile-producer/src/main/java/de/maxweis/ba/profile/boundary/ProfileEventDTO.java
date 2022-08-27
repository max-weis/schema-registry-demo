package de.maxweis.ba.profile.boundary;

import javax.persistence.Column;

public class ProfileEventDTO {
    Long id;
    String name;
    String email;
    String gender;
    String image;


    public static final class ProfileEventDTOBuilder {
        private Long id;
        private String name;
        private String email;
        private String gender;
        private String image;

        private ProfileEventDTOBuilder() {
        }

        public static ProfileEventDTOBuilder aProfileEventDTO() {
            return new ProfileEventDTOBuilder();
        }

        public ProfileEventDTOBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public ProfileEventDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProfileEventDTOBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public ProfileEventDTOBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public ProfileEventDTOBuilder withImage(String image) {
            this.image = image;
            return this;
        }

        public ProfileEventDTO build() {
            ProfileEventDTO profileEventDTO = new ProfileEventDTO();
            profileEventDTO.gender = this.gender;
            profileEventDTO.name = this.name;
            profileEventDTO.email = this.email;
            profileEventDTO.id = this.id;
            profileEventDTO.image = this.image;
            return profileEventDTO;
        }
    }
}
