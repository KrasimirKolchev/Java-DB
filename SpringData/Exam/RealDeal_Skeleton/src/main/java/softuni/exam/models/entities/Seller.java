package softuni.exam.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "sellers")
public class Seller extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private RatingType rating;
    private String town;

    public Seller() {
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column
    public RatingType getRating() {
        return rating;
    }

    public void setRating(RatingType rating) {
        this.rating = rating;
    }

    @Column
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}