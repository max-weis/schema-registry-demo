package de.maxweis.ba.profile.boundary;

public class ProfileEventDTO {

    public String id;

    public String firstName;

    public String lastName;

    public String email;

    public String gender;

    public String image;


    public static final class ProfileEventDTOBuilder {
        private String id;
        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private String image;

        private ProfileEventDTOBuilder() {
        }

        public static ProfileEventDTOBuilder aProfileEventDTO() {
            return new ProfileEventDTOBuilder();
        }

        public ProfileEventDTOBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public ProfileEventDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProfileEventDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
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
            profileEventDTO.lastName = this.lastName;
            profileEventDTO.id = this.id;
            profileEventDTO.email = this.email;
            profileEventDTO.image = this.image;
            profileEventDTO.firstName = this.firstName;
            return profileEventDTO;
        }
    }
}
