package junitPractice.lesson03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class UserTest {

    @Test
    public void testUserEquals() {
        assertEquals(new User("Kolya", 24), new User("Kolya", 24));
    }

    @Test
    public void testUserSame() {
        User user1 = new User("Kolya", 24);
        User user2 = user1;
        //Проверка на ==
        assertSame(user1, user2);
    }

}
