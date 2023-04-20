import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void addTest() {
        int result = PhoneBook.add("Anna", "89392929871");
        assertEquals(result, 1);
    }

    @Test
    public void addTestPlural() {
        int result = PhoneBook.add("Kate", "8585039282882") + PhoneBook.add("Ann", "8964538202822") + PhoneBook.add("Arina", "87564392833332");
        assertEquals(result, 3);
    }
}