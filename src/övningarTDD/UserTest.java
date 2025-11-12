package övningarTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testUsernameWith4Characters() {
        User user1 = new User("", "");

        user1.setUsername("stor");
        assertEquals("stor", user1.getUsername());

    }

    @Test
    void testPasswordWith6Characters() {
        User user1 = new User("", "");

        user1.setPassword("Qwert1!");
        assertEquals("Qwert1!", user1.getPassword());

    }

    @Test
    void testPasswordWithSpecialCharacters() {

    }

    @Test
    void testTypeOfUser() {
        User user1 = new User("", "");

        user1.setTypeOfUser("admin");
        assertEquals("admin", user1.getTypeOfUser());

    }

    @Test
    void userBecomesGoldMemberAfter20LogIns() {
        User user1 = new User("", "");
        for (int i = 0; i < 20; i++) {
            user1.logIn();
        }

        assertEquals("gold member", user1.getTypeOfUser());
    }

    @Test
    void testOfSolidus() {
        User user1 = new User("", "");

        assertEquals(5, user1.getSolidus());
    }

    @Test
    void testWrongAmountOfSolidus() {
        User user1 = new User("", "");

        user1.setSolidus(5);
        assertEquals(5, user1.getSolidus());
    }

    @Test
    void testSolidusAmountAfter20LogIns() {
        User user1 = new User("", "");
        for (int i = 0; i < 20; i++) {
            user1.logIn();

        }
        assertEquals(45, user1.getSolidus());

    }

    @Test
    void testSolidusIncreaseOnLogIn() {
        User user1 = new User("", "");

        user1.logIn();
        assertEquals(6, user1.getSolidus());


    }
}

