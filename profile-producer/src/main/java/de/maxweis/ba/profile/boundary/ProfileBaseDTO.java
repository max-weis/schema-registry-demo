package de.maxweis.ba.profile.boundary;

import de.maxweis.ba.profile.entity.Profile;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "the DTO object to create a profile")
public class ProfileBaseDTO {
    @Schema(example = "John")
    public String firstName;
    @Schema(example = "Doe")
    public String lastName;
    @Schema(example = "john.doe@example.com")
    public String email;
    @Schema(example = "male")
    public String gender;
    @Schema(example = "https://robohash.org/quodminusqui.png?size=50x50&set=set1")
    public String image;

    public Profile toEntity() {
        return Profile.ProfileBuilder.aProfile()
                .withFirstName(this.firstName)
                .withLastName(this.lastName)
                .withEmail(this.email)
                .withGender(this.gender)
                .withImage(this.image)
                .build();
    }
}
