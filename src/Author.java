import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Author) {
            Author author1 = (Author) obj;
            if (this.firstName == author1.getFirstName() && this.lastName == author1.getLastName()) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
    }
}

