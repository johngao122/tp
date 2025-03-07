package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a remark of a person in the address book.
 */
public class Remark {
    public final String value;

    /**
     * Constructs a {@code Remark}.
     *
     * @param remark A valid remark string.
     */
    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof Remark && value.equals(((Remark) other).value));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
