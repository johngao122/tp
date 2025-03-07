package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RemarkTest {

    @Test
    public void equals() {
        Remark remark = new Remark("Remark");

        //same object -> returns true
        assertTrue(remark.equals(remark));

        //same values -> returns true
        Remark remarkCopy = new Remark("Remark");
        assertTrue(remark.equals(remarkCopy));

        //different types -> returns false
        assertFalse(remark.equals(5.0f));

        //null -> returns false
        assertFalse(remark.equals(null));

        //different remark -> returns false
        assertFalse(remark.equals(new Remark("Different remark")));
    }
}
